package com.ness.academy.bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {

	private String id;
	private List<Product> products;
        
        public Order(){
        }
        
	public Order(List<Product> products) {
		super();
		this.id = setOrderId();
                this.products = products;
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
