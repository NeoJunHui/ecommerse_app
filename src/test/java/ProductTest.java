import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	
	private ProductList pl;
	private Product p1;
	private Product p2;
	private Product p3;
	private Product p4;
	private final int PRODUCT_COLLECTION_SIZE = 4;

	@BeforeEach
	void setUp() throws Exception {
		// Arrange
		pl = new ProductList();
		p1 = new Product("0001", "Iphone 9", 100, 200);
		p2 = new Product("0002", "USB-C adaptor", 58, 4.99);
		p3 = new Product("0003", "Laptop", 89, 999.90);
		p4 = new Product("0004", "Extension Cord", 30, 10.99);
		pl.addProduct(p1);
		pl.addProduct(p2);
		pl.addProduct(p3);
		pl.addProduct(p4);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	
	void testAddProduct() {
		pl.addProduct(p1);
		
		List<Product> testPl = pl.getProduct();
	}
	
	void testGetProduct() {
		List<Product> testPl = pl.getProduct();
	}
	
	void testSortProductByName() {
		pl.sortProductByName();
		
		List<Product> testPl = pl.getProduct();
	}
	
	void testSortProductByStock() {
		pl.sortProductByStock();
		
		List<Product> testPl = pl.getProduct();
	}
	
	void testSortProductByPrice() {
		pl.sortProductByPrice();
		
		List<Product> testPl = pl.getProduct();
	}
	
	void testFindProductById() {
		pl.findProductsById("0001");
	}
	
	void testFindProductByName() {
		pl.findProductByName("Laptop");
	}
}
