package com.ness.academy.bean;

import java.util.UUID;

public class Product {
    private String id;
    private String name;
    private String description;
    private String price;
    
        public Product(){
        }
    
	public Product(String name, String description, String price) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
        
        public void setId() {
		this.id = UUID.randomUUID().toString();
	}
        
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getPrice() {
		return price;
	}
       
        public void setName(String name) {
		this.name = name;
	}
        public void setDescription(String description) {
		this.description = description;
	}
        
        public void setPrice(String price) {
		this.price = price;
	}
        
	@Override
	public String toString() {
		return "Product: name=" + name + ", description=" + description + ", price=" + price + "\n";
	}
}
