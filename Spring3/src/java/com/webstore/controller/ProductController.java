/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webstore.controller;

import com.webstore.domain.Product;
import com.webstore.domain.repository.ProductRepository;
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
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;
    
    @RequestMapping("/products")
    public String list(Model model)
    {
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }
    
}
