package app;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Inventory
 */
public class Inventory implements Iterable<StockableProduct> {
    private ArrayList<StockableProduct> items = new ArrayList<StockableProduct>();
    
    public Inventory() {}

    public void addItem(StockableProduct item) {
        items.add(item);
    }

    public void removeItem(int productId) {
        items.removeIf(n -> n.getProductId() == productId);        
    }

    public Product getProduct(int productId) {
        StockableProduct target = null;
        
        for (StockableProduct item: items) {
            if(item.getProductId() == productId){
                target = item;
                break;
            }
        }
        
        return target.getProduct();
    }

    public void addProductStock(int productId, int numberOfNewStock){
        for (StockableProduct item : items) {
            if(item.getProductId() == productId){
                item.addStock(numberOfNewStock);
            }
        }
    }

    @Override
    public Iterator<StockableProduct> iterator() {
        return this.items.iterator();
    }

    public void sortByPrice(){
        StockableProductSorter st = new StockableProductSorter(items);
        items = st.getSortedStockableProductByPrice();        
    }

    public void sortByAvailableStock(){
        StockableProductSorter st = new StockableProductSorter(items);
        items = st.getSortedStockableProductByAvailableStock();
    }
}