/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness.academy.controller;

import com.ness.academy.bean.Product;
import com.ness.academy.dao.ProductDao;
import java.util.List;

/**
 *
 * @author P3502442
 */
public class ProductService {
    
    private ProductDao productDao;
    
    public ProductService(){
    productDao = new ProductDao();
    }
    
    //-------------------------------------------------------------------------
   private boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean canAdd(String name, String description, String price){
        if (name.isEmpty() || description.isEmpty() || price.isEmpty() || isDouble(price)==false) {
            return false;
        }
        return true;
    }
    
    //-------------------------------------------------------------------------
    
    public void add(String name, String description, String price){
        if(canAdd(name, description, price)==true){
            Product product = new Product(name, description, price);
            productDao.add(product);
        }
    }
    
    public Product getByName(String name){
        return productDao.findByName(name);
    }
    
    public List<Product> products() {
	return productDao.products();
    }
    
    public List<String> productNames() {
	return productDao.productNames();
    }
    
    public void removeById(String id){
        Product product = productDao.findById(id);
        productDao.remove(product);
    }
    public void removeByName(String name){
        Product product = productDao.findByName(name);
        productDao.remove(product);
    }
    public void removeByString(String string){
        Product product = productDao.findByString(string);
        productDao.remove(product);
    }
}
