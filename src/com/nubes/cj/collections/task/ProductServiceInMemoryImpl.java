package com.nubes.cj.collections.task;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceInMemoryImpl implements ProductService {

	private List<Product> products;
	
	public ProductServiceInMemoryImpl() {
		products = new ArrayList<>();
	}
	
	@Override
	public Product addProduct(Product product) {
		if(product != null){
			products.add(product);
		}
		return product;
	}

	@Override
	public boolean deleteProduct(Integer pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public List<Product> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product udpateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductPriceInRange(float lp, float up) {
		List<Product> priceRangeList = new ArrayList<>();
		for(Product p:products){
			if(p.getPrice() >= lp && p.getPrice() <= up){
				priceRangeList.add(p);
			}
		}
		return priceRangeList;
	}

}
