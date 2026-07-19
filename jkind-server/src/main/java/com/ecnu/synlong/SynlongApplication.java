package com.ecnu.synlong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@SpringBootApplication
public class SynlongApplication {
	private static final String HOME_URL = "http://localhost:8080";
	private static final AtomicReference<ConfigurableApplicationContext> CONTEXT = new AtomicReference<>();
	private static final AtomicBoolean TRAY_CREATED = new AtomicBoolean();

	public static void main(String[] args) {
		start(args);
	}

	private static void start(String[] args) {
		SpringApplication app = new SpringApplication(SynlongApplication.class);
		app.setHeadless(false);
		CONTEXT.set(app.run(args));
		createTray(args);
		openBrowser();
	}

	private static void createTray(String[] args) {
		if (!SystemTray.isSupported() || !TRAY_CREATED.compareAndSet(false, true)) {
			return;
		}

		PopupMenu menu = new PopupMenu();
		MenuItem openItem = new MenuItem("打开页面");
		MenuItem restartItem = new MenuItem("重启服务");
		MenuItem exitItem = new MenuItem("退出程序");
		openItem.addActionListener(event -> openBrowser());
		restartItem.addActionListener(event -> restart(args, restartItem));
		exitItem.addActionListener(event -> exit());
		menu.add(openItem);
		menu.add(restartItem);
		menu.addSeparator();
		menu.add(exitItem);

		TrayIcon trayIcon = new TrayIcon(createTrayImage(), "模型正确性检查软件", menu);
		trayIcon.setImageAutoSize(true);
		trayIcon.addActionListener(event -> openBrowser());
		try {
			SystemTray.getSystemTray().add(trayIcon);
		} catch (AWTException e) {
			TRAY_CREATED.set(false);
			System.err.println("无法创建系统托盘: " + e.getMessage());
		}
	}

	private static Image createTrayImage() {
		BufferedImage image = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = image.createGraphics();
		graphics.setColor(new java.awt.Color(25, 118, 210));
		graphics.fillRoundRect(1, 1, 30, 30, 8, 8);
		graphics.setColor(java.awt.Color.WHITE);
		graphics.fillOval(7, 7, 6, 6);
		graphics.fillOval(19, 7, 6, 6);
		graphics.fillOval(13, 19, 6, 6);
		graphics.drawLine(10, 12, 15, 20);
		graphics.drawLine(22, 12, 17, 20);
		graphics.dispose();
		return image;
	}

	private static void openBrowser() {
		try {
			new ProcessBuilder("cmd", "/c", "start", "", HOME_URL).start();
		} catch (Exception e) {
			try {
				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().browse(new URI(HOME_URL));
				}
			} catch (Exception fallbackException) {
				System.err.println("无法自动打开浏览器: " + fallbackException.getMessage());
			}
		}
	}

	private static void restart(String[] args, MenuItem restartItem) {
		restartItem.setEnabled(false);
		new Thread(() -> {
			try {
				ConfigurableApplicationContext context = CONTEXT.getAndSet(null);
				if (context != null) {
					context.close();
				}
				start(args);
			} finally {
				EventQueue.invokeLater(() -> restartItem.setEnabled(true));
			}
		}, "service-restart").start();
	}

	private static void exit() {
		ConfigurableApplicationContext context = CONTEXT.getAndSet(null);
		if (context != null) {
			context.close();
		}
		System.exit(0);
	}

}
