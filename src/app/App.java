package app;

public class App {
    public static void main(String[] args) throws Exception {
        Music m1 = new Music("abc", 1231, 9, false, 2015, "rock", 2.5, 5, "cvb", "asd");
        Music m2 = new Music("acc", 1232, 7, false, 2016, "rock", 5.5, 15, "cvb", "asd");
        Movies m3 = new Movies("acd", 1233, 20, false, 2000, "crime", 2.4, 10, "nolan");
        Movies m4 = new Movies("abd", 1234, 18, false, 2013, "crime", 2.3, 2, "nolan");
        
        Inventory i = new Inventory();
        
        i.addItem(m1);
        i.addItem(m2);
        i.addItem(m3);
        i.addItem(m4);
        
        Invoice inv = new Invoice();

        inv.addProduct(i.getProduct(1231));
        inv.addProduct(i.getProduct(1231));
        inv.addProduct(i.getProduct(1233));
        inv.addProduct(i.getProduct(1234));

        // System.out.println(inv.getInvoice());

        // i.sortByAvailableStock();

        // for (StockableProduct item : i) {
        //     System.out.println(item.getInfo());
        // }

        // i.addProductStock(1231, 1000);

        // for (StockableProduct item : i) {
        //     System.out.println(item.getInfo());
        // }
    }
}