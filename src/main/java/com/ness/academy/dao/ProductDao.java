/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness.academy.dao;

import com.ness.academy.bean.Product;
import com.ness.academy.controller.OrderService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P3502442
 */
public class ProductDao implements IProductDao{
    List<Product> products=new ArrayList<Product>();
    
    public ProductDao()
    {
        OrderService.productDao = this;
    }
    
    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> products() {
        return products;
    }
    
    @Override
    public List<String> productNames() {
        List<String> names=new ArrayList<String>();
            for(Product product:products){
                names.add(product.getName());
            }
		return names;
    }

    //FIXME
    @Override
    public void modify(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public Product findById(String id) {
        for (int i = 0; i < products().size(); i++) {
              if (products().get(i).getId() == id) {
                return products().get(i);
              }
            }
            return null;
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < products().size(); i++) {
              if (products().get(i).getName().compareTo(name)==0) {
                return products().get(i);
              }
            }
            return null;
    }

    @Override
    public Product findByString(String string) {
         for (int i = 0; i < products().size(); i++) {
                String productString = products().get(i).toString();
              if (productString.contains(string)) {
                return products().get(i);
              }
            }
            return null;
    }   
}
