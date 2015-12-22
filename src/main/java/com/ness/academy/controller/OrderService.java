
package com.ness.academy.controller;

import com.ness.academy.bean.Order;
import com.ness.academy.bean.Product;
import com.ness.academy.bean.User;
import com.ness.academy.dao.OrderDao;
import com.ness.academy.dao.ProductDao;
import com.ness.academy.dao.UserDao;
import java.util.List;

public class OrderService {
    
    private OrderDao orderDao;
    public static ProductDao productDao;
    public static UserDao userDao;
    
    public OrderService(){
    orderDao = new OrderDao();
    }
    
    //FIXME
    public void addOrder(List<Product> products){
        if(!products.isEmpty()){
            Order order = new Order();
            order.setProducts(products);
            order.setUser(userDao.users().get(0));
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
}
