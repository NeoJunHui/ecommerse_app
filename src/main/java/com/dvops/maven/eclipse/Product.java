package com.dvops.maven.eclipse;

public class Product {
	protected Integer id_product;
	public Product(Integer id_product, String product_name, String category, String description, Float price,
			Integer stock) {
		super();
		this.id_product = id_product;
		this.product_name = product_name;
		this.category = category;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	protected String product_name;
	public Integer getId_product() {
		return id_product;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Float getPrice() {
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public Integer getStock() {
		return stock;
	}
	
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	protected String category;
	protected String description;
	protected Float price;
	protected Integer stock;
}
