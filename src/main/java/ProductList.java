import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductList {
	
	private ArrayList<Product> products = new ArrayList<>();
    private int capacity;

    public ProductList() {
    	this.capacity = 20;
    }
    
    public List<Product> getProduct() {
        return products;
    }

    public void addProduct(Product product) {
    	if(products.size() != capacity) {
    		products.add(product);
    	}
    }
    
    public ArrayList<Product> sortProductByName() {         
        Collections.sort(products, Product.nameComparator);         
        return products;     
    } 
    
    public ArrayList<Product> sortProductByStock() {         
        Collections.sort(products, Product.stockComparator);         
        return products;     
    } 
    
    public ArrayList<Product> sortProductByPrice() {         
        Collections.sort(products, Product.priceComparator);         
        return products;     
    } 
    
    public Product findProductsById(String id) {
    	for (Product s : products) { 		      
            if(s.getId().equals(id)) return s;
       }
    	return null;
    }

    public Product findProductByName(String name) {
    	for (Product s : products) { 		      
            if(s.getName().equals(name)) return s;
       }
    	return null;
    }
}
