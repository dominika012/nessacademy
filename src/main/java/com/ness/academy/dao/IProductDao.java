
package com.ness.academy.dao;

import com.ness.academy.bean.Product;
import java.util.List;

public interface IProductDao {
	public void add(Product product);

	public List<Product> products();
        
        public List<String> productNames();

        public void modify(Product product);
        
	public void remove(Product product);
        
        public Product findById(String id);
        
        public Product findByName(String name);
        
        public Product findByString(String string);
}
