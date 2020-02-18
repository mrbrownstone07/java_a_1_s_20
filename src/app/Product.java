package app;

/**
 * Product
 */
public abstract class Product {
    private String name;
    private int productId;
    private double price;
    private boolean isRentable;
    private int yearOfPublish;
    private String genre;
    private double discount;

    public Product() { }

    public Product(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, double discount) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.isRentable = isRentable;
        this.genre = genre;
        this.yearOfPublish = yearOfPublish;
        this.discount = discount;
    }

    public double getDiscount() {return discount;}
    public void setDiscount(double discount) {this.discount = discount;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getProductId() {return productId;}
    public void setProductId(int productId) {this.productId = productId;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public boolean isRentable() {return isRentable;}
    public void setRentable(boolean isRentable) {this.isRentable = isRentable;}

    public int getYearOfPublish() {return yearOfPublish;}
    public void setYearOfPublish(int yearOfPublish) {this.yearOfPublish = yearOfPublish;}

    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    public abstract String getInfo();
    
    public String invoiceFormat(){
        return "Name: "+this.getName()
                +", Price: "+this.getPrice();
    }

    @Override
    public String toString() {
        return "Product [genre=" + genre + ", isRentable=" + isRentable + ", name=" + name + ", price=" + price
                + ", productId=" + productId + ", yearOfPublish=" + yearOfPublish + "]";
    }    
}
