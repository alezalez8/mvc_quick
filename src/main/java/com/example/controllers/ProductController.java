package com.example.controllers;

import com.example.model.Product;
import com.example.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Product product,/*@RequestParam String name,
                             @RequestParam String price,*/
                             Model model) {
       /* Product product = new Product();
        product.setName(name);
        product.setPrice(Integer.parseInt(price));*/
        productService.addProduct(product);

        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }
}
