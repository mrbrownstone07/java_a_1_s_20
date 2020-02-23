package app;

/**
 * Movie
 */
public class Movie extends StockableProduct{
    private String directorName;
    
    public Movie(String name, double price, int yearOfPublish, String genre, double discount, int numberOfItemsStocked) {
        super(name, price, yearOfPublish, genre, discount, numberOfItemsStocked);
    }

    public Movie(String name, double price, int yearOfPublish, String genre, double discount, int numberOfItemsStocked, String directorName) {
        super(name, price, yearOfPublish, genre, discount, numberOfItemsStocked);
        this.directorName = directorName;
    }

    public String getDirectorName() {return directorName;}
    public void setDirectorName(String directorName) {this.directorName = directorName;}

    @Override
    public String getInfo() {
        return "Movie: "+super.getName() 
                + ", price: "+super.getPrice()
                + ", discount: "+super.getDiscount()
                + ", year of publish: "+super.getYearOfPublish()
                + ", number of stock available: "+super.getNumberOfItemsStocked()
                + ", genre: "+super.getGenre()
                + ", director: "+this.getDirectorName()
                + ", product id: "+ super.getProductId();
    }
}
