/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webstore.service.impl;

import com.webstore.domain.Product;
import com.webstore.domain.repository.ProductRepository;
import com.webstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class OrderServiceImpl implements OrderService{
    
    
    @Autowired
    private ProductRepository productRepository;
        

    @Override
    public void processOrder(String productId, long quantity) {
       
        Product productById = productRepository.getProductById(productId);
        
        if(productById.getUnitsInStock() < quantity)
        {
            throw new IllegalArgumentException("Out of stock.Available units in stock" + productById.getUnitsInStock());
        }
               
        productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
    }
    
}
