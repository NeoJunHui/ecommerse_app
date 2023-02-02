import java.util.Comparator;

public class Product {
	private String id;
	private String name;
	private Integer stock;
	private double price;
	
	public Product(String id, String name, Integer stock, double price) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param title the title to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the artiste
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * @param artiste the artiste to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	/**
	 * @return the songLength
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param songLength the songLength to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static Comparator<Product> nameComparator = new Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return (int) (p1.getName().compareTo(p2.getName()));
		}
	};
	
	public static Comparator<Product> stockComparator = new Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return (int) (p1.getStock().compareTo(p2.getStock()));
		}
	};

	public static Comparator<Product> priceComparator = new Comparator<Product>() {
		@Override         
	    public int compare(Product p1, Product p2) {             
	      return (p2.getPrice() < p1.getPrice() ? -1 :                     
	              (p2.getPrice() == p1.getPrice() ? 0 : 1));           
	    }     
	};
}
