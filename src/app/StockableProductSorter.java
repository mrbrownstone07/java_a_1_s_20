package app;

import java.util.ArrayList;
import java.util.Collections;

/**
 * StockableProductSorter
 */
public class StockableProductSorter {
    private ArrayList<StockableProduct> list = new ArrayList<StockableProduct>();

    public StockableProductSorter(ArrayList<StockableProduct> list) {
        this.list = list;
    }

    public ArrayList<StockableProduct> getSortedStockableProductByPrice(){
        Collections.sort(list, StockableProduct.priceComparator);
        return list;
    }

    public ArrayList<StockableProduct> getSortedStockableProductByAvailableStock(){
        Collections.sort(list, StockableProduct.availabeStockComparator);
        return list;
    }
    
    
}