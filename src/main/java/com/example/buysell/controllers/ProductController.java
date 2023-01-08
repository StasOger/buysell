package com.example.buysell.controllers;

import com.example.buysell.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    private final ProductService
    @GetMapping("/")
    public String products() {
        return "products";
    }
}
