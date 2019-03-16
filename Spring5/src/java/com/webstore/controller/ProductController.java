/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webstore.controller;

import com.webstore.domain.Product;
import com.webstore.domain.repository.ProductRepository;
import com.webstore.service.ProductService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/products")   //relative path otan einai to requestMapping se epipedo klasis
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @RequestMapping
    public String list(Model model)
    {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
    
    @RequestMapping("/all")
    public String allProducts(Model model)
    {
        model.addAttribute("products",productService.getAllProducts());
        return "products";
    }
    
}
