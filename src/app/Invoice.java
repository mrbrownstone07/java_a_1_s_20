package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Invoice
 */
public class Invoice {
    private ArrayList<Product> list = new ArrayList<Product>();
    private HashMap<Product, Integer> listMap = new HashMap<Product, Integer>();
    
    public Invoice() {}

    public void addProduct(Product product){
        list.add(product);  
        System.err.println(this.getClassFalg(product));

    }

    public void removeProduct(Product product){
        list.remove(product);
    }

    public double calculatePrice(){
        double price = 0.0;
        for( Product product : list ){
            price += product.getPrice();
        }
        return price;
    }

    public String getInvoice(){
        String invoice = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n";
        for (Product product : list) {
            invoice += product.invoiceFormat() + "\n";
        }
        return invoice;
    }

    private int getClassFalg(Product product){
        String p = product.getClass().getSimpleName();
        return (p.equals("Music") ? 1 : (p.equals("Movies") ? 2 : 3));
    }
    

    
}
