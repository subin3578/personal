package com.farmstory.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 지현님&상훈님
@Controller
public class CartController {

    // cart
    @GetMapping("/market/cart")
    public String cart() {
        return "/market/cart";
    }
}
