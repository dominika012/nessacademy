
package com.ness.academy.dao;

import com.ness.academy.bean.Order;
import java.util.List;

public interface IOrderDao {
	
        public void addOrder(Order order);
        
        public List<Order> orders();
        
        public void modify(Order order);
        
        public void remove(Order order);
        
        public Order findById(String id);
}
