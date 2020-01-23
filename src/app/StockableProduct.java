package app;

import java.util.Comparator;

/**
 * StockableProduct
 */
public abstract class StockableProduct extends Product implements Stockable {
	private int numberOfItemsStocked;

	public StockableProduct(String name, int productId, double price, boolean isRentable,int yearOfPublish, String genre) {
		super(name, productId, price, isRentable, yearOfPublish, genre);
	}

	public StockableProduct(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, int numberOfItemsStocked) {
		super(name, productId, price, isRentable, yearOfPublish, genre);
		this.numberOfItemsStocked = numberOfItemsStocked;
	}
	
	public int getNumberOfItemsStocked() {return numberOfItemsStocked;}
	public void setNumberOfItemsStocked(int numberOfItemsStocked) {
		this.numberOfItemsStocked = numberOfItemsStocked;
	}	

	@Override
	public void addStock(int numberOfItemsToBeAdded) {
		this.numberOfItemsStocked += numberOfItemsToBeAdded;
	}

	@Override
	public void removeStock(int numberOfItemsToBeRemoved) {
		if((numberOfItemsStocked - numberOfItemsToBeRemoved) > 0)
			this.numberOfItemsStocked -= numberOfItemsToBeRemoved;
	}

	@Override
	public void editStock(int numberOfnewProducts) {
		this.numberOfItemsStocked = numberOfnewProducts;
	}
	
	public Product getProduct(){
		this.removeStock(1);
		return this;
	}

	public static Comparator<StockableProduct> priceComparator = new Comparator<StockableProduct>(){
		public int compare(StockableProduct p1, StockableProduct p2){
			return (p1.getPrice() < p2.getPrice() ? -1 : 
						p1.getPrice() == p2.getPrice() ? 0 : 1);
		}
	};

	public static Comparator<StockableProduct> availabeStockComparator = new Comparator<StockableProduct>(){
		public int compare(StockableProduct p1, StockableProduct p2){
			return (p1.getNumberOfItemsStocked() < p2.getNumberOfItemsStocked() ? -1 :
						p1.getNumberOfItemsStocked() == p2.getNumberOfItemsStocked() ? 0 : 1);
		}
	};


}