/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webstore.domain.repository.impl;

import com.webstore.domain.Product;
import com.webstore.domain.repository.ProductRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public class InMemoryProductRepository implements ProductRepository{
    
    
    List<Product> listOfProducts = new ArrayList<Product>();

    public InMemoryProductRepository() {
        Product iphone = new Product("P1234","Iphone 5s",new BigDecimal(500));
        iphone.setDescription("Apple iPhone 5s smartphone + with 4.00-inch display");
        iphone.setCategory("Smart Phone");
        iphone.setManufacturer("Apple");
        iphone.setUnitsInStock(1000);
        
        
        Product laptop_dell = new Product("P1235","Dell Inspiron",new BigDecimal(700));
        laptop_dell.setDescription("Dell Inspiron 14-inch laptop");
        laptop_dell.setCategory("Laptop");
        laptop_dell.setManufacturer("Dell");
        laptop_dell.setUnitsInStock(1000);
        
        Product tablet_Nexus = new Product("P1233","Nexus 7",new BigDecimal(300));
        tablet_Nexus.setDescription("Google Nexus 7 is the lightest 7 inch tablet.");
        tablet_Nexus.setCategory("Tablet");
        tablet_Nexus.setManufacturer("Google");
        tablet_Nexus.setUnitsInStock(1000);
        
        listOfProducts.add(iphone);
        listOfProducts.add(laptop_dell);
        listOfProducts.add(tablet_Nexus);
                
    }

    
    
    
    
    
    @Override
    public List<Product> getAllProducts() {
        return listOfProducts;
    }

    @Override
    public Product getProductById(String productId) {
        Product productById = null;
        for(Product product:listOfProducts)
        {
            if(product !=null &&
                    product.getProductId() !=null && 
                    product.getProductId().equals(productId))
            {
                productById = product;
                break;
            }
        }
        
        if(productById == null)
        {
            throw new IllegalArgumentException("No products found with the product id: " + productId);
        }
        return productById;
    }
    
}
