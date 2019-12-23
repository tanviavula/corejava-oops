package com.nubes.cj.collections.task;

import java.util.List;

public interface ProductService {
	
		public Product addProduct(Product product);
		public boolean deleteProduct(Integer pid);
		public List<Product> getProducts();
		public List<Product> search(String str);
		public Product udpateProduct(Product product);
		public List<Product> getProductPriceInRange(float lp, float up);
		
}
