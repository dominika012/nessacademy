
package com.ness.academy.dao;

import com.ness.academy.bean.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderDao implements IOrderDao{
    List<Order> orders=new ArrayList<Order>();
    
        @Override
        public void addOrder(Order order) {
		orders.add(order);
	}
        
        
        @Override
        public List<Order> orders() {
		return orders;
	}
        
        //FIXME
        @Override
        public void modify(Order order) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void remove(Order order) {
            orders.remove(order);
        }

        @Override
        public Order findById(String id) {
             for (int i = 0; i < orders().size(); i++) {
                  if (orders().get(i).getId() == id) {
                    return orders().get(i);
                  }
                }
                return null;
        }
        
        
}
