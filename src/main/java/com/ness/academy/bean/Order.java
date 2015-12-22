package com.ness.academy.bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {

	private String id;
	private List<Product> products;
        private User user;
        
        public Order(){
        }
        
	public Order(List<Product> products, User user) {
		super();
		this.id = setOrderId();
                this.products = products;
                this.user = user;
	}
        
        public String getId() {
		return id;
	}

        public void setId() {
		this.id = setOrderId();
	}
        
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
        
        public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
        
	@Override
	public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Order  id:  " + id + "\n");
            String productString = "";
            for(Product product:products){
                productString = product.toString();
                stringBuilder.append("\t" + productString);
            }
		return stringBuilder.toString();
	}

	
	private String setOrderId(){
	Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyhhmmssMs");
        String datetime = ft.format(dNow);
        return datetime;
	}
	
	
}
