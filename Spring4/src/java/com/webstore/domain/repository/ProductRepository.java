/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webstore.domain.repository;

import com.webstore.domain.Product;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ProductRepository {
    
    List<Product> getAllProducts();
    
    Product getProductById(String productId);
    
}
