package com.farmstory.Controller;

import com.farmstory.entity.product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AdminController {
    @GetMapping(value={"/admin/","/admin/index"})
    public String index() {
        return "/admin/index";
    }


    @GetMapping("/admin/order/list")
    public String orderList() {
        return "/admin/order/list";
    }
    @GetMapping("/admin/user/list")
    public String userList() {
        return "/admin/user/list";
    }

}
