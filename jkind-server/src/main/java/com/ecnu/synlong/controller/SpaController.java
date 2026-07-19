package com.ecnu.synlong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * SPA 前端路由 fallback：将前端路由路径转发到 index.html，
 * 让浏览器刷新子路径时不会 404。
 * 仅处理 GET 请求，不影响 /lustre/check 等 POST API。
 */
@Controller
public class SpaController {

    @GetMapping(value = {"/", "/lustre", "/editor", "/simulator", "/verifier"})
    public String forward() {
        return "forward:/index.html";
    }
}
