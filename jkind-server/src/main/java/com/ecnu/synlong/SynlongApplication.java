package com.ecnu.synlong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;

import java.awt.Desktop;
import java.net.URI;

@SpringBootApplication
public class SynlongApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SynlongApplication.class);
		// 服务启动完成后自动打开默认浏览器
		app.addListeners((event) -> {
			if (event instanceof ApplicationReadyEvent) {
				try {
					if (Desktop.isDesktopSupported()) {
						Desktop.getDesktop().browse(new URI("http://localhost:8080"));
					}
				} catch (Exception e) {
					// 打开浏览器失败不影响服务运行
					System.err.println("无法自动打开浏览器: " + e.getMessage());
				}
			}
		});
		app.run(args);
	}

}
