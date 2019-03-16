/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webstore.controller;

import com.webstore.domain.Product;
import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
public class ProductController {
    
    @RequestMapping("/products")
    public String list(Model model)
    {
        Product iphone = new Product("P1234","Iphone 5s",new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s smartphone + with 4.00-inch display");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        model.addAttribute("product", iphone);
        
        return "products";
    }
    
}
