package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Invoice
 */
public class Invoice {
    private ArrayList<Product> list = new ArrayList<Product>();
    private int pc[] = {0, 0, 0};
    
    public Invoice() {}

    public void addProduct(Product product){
        list.add(product);
        pc[product.getClassFlag()]++;
    }

    public void removeProduct(Product product){
        list.remove(product);
    }

    private boolean isFullHouseDiscountAvailable(){
        return (pc[0] == 2 && pc[1] == 2 && pc[2] == 2);
    }

    private double calculateDiscountedPrice(){
        double discountedPrice = 0;
        double priceWOdis = calculatePriceWithOutDiscount();
        for (Product product : list) 
            discountedPrice += product.getPrice() - (product.getPrice() * (product.getDiscount() / 100));
        
        return (isFullHouseDiscountAvailable() ? 
                    priceWOdis / 2 > discountedPrice ? discountedPrice : 
                        priceWOdis / 2  : discountedPrice);
    }

    private double calculatePriceWithOutDiscount(){
        double price = 0.0;
        for( Product product : list ) price += product.getPrice();
        return price;
    }

    public String getInvoice(){
        String invoice = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n";
        for (Product product : list)  invoice += product.invoiceFormat() + "\n";
        invoice += "Total price: "+ this.calculatePriceWithOutDiscount() + "\n";
        invoice += "Price after discount: "+ this.calculateDiscountedPrice() + "\n";
        return invoice;
    }

    // private int getClassFalg(Product product){
    //     String p = product.getClass().getSimpleName();
    //     return (p.equals("Music") ? 0: (p.equals("Movies") ? 1 : 2));
    // }   
}
