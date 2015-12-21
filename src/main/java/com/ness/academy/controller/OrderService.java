
package com.ness.academy.controller;

import com.ness.academy.bean.Order;
import com.ness.academy.bean.Product;
import com.ness.academy.dao.ProductDao;
import com.ness.academy.dao.OrderDao;
import java.util.List;

public class OrderService {
    
    private OrderDao orderDao;
    public static ProductDao productDao;
    
    public OrderService(){
    orderDao = new OrderDao();
    }
    
    public void addOrder(List<Product> products){
        if(!products.isEmpty()){
            Order order = new Order(products);
            orderDao.addOrder(order);
        }
    }
    
    public List<Order> orders() {
	return orderDao.orders();
    }
    
    
    public void removeOrderById(String id) {
        Order order = orderDao.findById(id);
        orderDao.remove(order);
    }
    
    public void removeProductById(int id){
        
    }
    
    public void removeProductByName(String name){
        
    }
    
}
