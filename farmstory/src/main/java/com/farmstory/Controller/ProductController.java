package com.farmstory.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 수빈님 - product
@Controller
public class ProductController {
    // cart
    @GetMapping("/market/list")
    public String list() {
        return "/market/list";
    }


}
