package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Invoice
 */
public class Invoice {
    private ArrayList<Product> list = new ArrayList<Product>();

    public Invoice() {}
    public Invoice(ArrayList<Product> list) {
        this.list = list;
    }

    public void addProduct(Product product){
        list.add(product);
    }

    public void removeProduct(Product product){
        list.remove(product);
    }

    public double calculatePrice(){
        return 0;
    }

    public String getInvoice(){
        String invoice = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n";
        for (Product product : list) {
            invoice += product.invoiceFormat() + "\n";
        }
        return invoice;
    }

    

    
}