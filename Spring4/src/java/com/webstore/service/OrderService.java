/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webstore.service;

/**
 *
 * @author Administrator
 */
public interface OrderService {
    
    
    void processOrder(String productId,long quantity);
    
}
