package com.farmstory.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminController {
    @GetMapping("/admin/index")
    public String index() {
        return "/admin/index";
    }
    @GetMapping("/admin/product/list")
    public String productList() {
        return "/admin/product/list";
    }
    @GetMapping("/admin/product/register")
    public String productRegister() {
        return "/admin/product/register";
    }
    @GetMapping("/admin/user/list")
    public String userList() {
        return "/admin/user/list";
    }

}
