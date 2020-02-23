package app;

/**
 * Product
 */
public abstract class Product {
    private String name;
    private int productId;
    private double price;
    private int yearOfPublish;
    private String genre;
    private double discount;
    private static int n = 0;

    public Product() { }

    public Product(String name, double price, int yearOfPublish, String genre, double discount) {
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.yearOfPublish = yearOfPublish;
        this.discount = discount;
        this.productId = Product.n++;
    }

    public double getDiscount() {return discount;}
    public void setDiscount(double discount) {this.discount = discount;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getProductId() {return this.productId;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getYearOfPublish() {return yearOfPublish;}
    public void setYearOfPublish(int yearOfPublish) {this.yearOfPublish = yearOfPublish;}

    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    public abstract String getInfo();
    
    public String invoiceFormat(){
        return "Name: "+this.getName()
                +", Price: "+this.getPrice();
    }

    public int getClassFlag(){
        String p = this.getClass().getSimpleName();
        return (p.equals("Music") ? 0 : (p.equals("Movie") ? 1 : 2));
    }

    @Override
    public String toString() {
        return "Product [genre=" + genre + ", name=" + name + ", price=" + price
                + ", productId=" + productId + ", yearOfPublish=" + yearOfPublish + "]";
    }    
}
