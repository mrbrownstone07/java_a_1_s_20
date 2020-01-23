package app;

/**
 * Movies
 */
public class Movies extends StockableProduct implements Rentable{
    private String directorName;
    
    public Movies(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre,
            int numberOfItemsStocked) {
        super(name, productId, price, isRentable, yearOfPublish, genre, numberOfItemsStocked);
    }

    public Movies(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, int numberOfItemsStocked,
            String directorName) {
        super(name, productId, price, isRentable, yearOfPublish, genre, numberOfItemsStocked);
        this.directorName = directorName;
    }

    public String getDirectorName() {return directorName;}
    public void setDirectorName(String directorName) {this.directorName = directorName;}

    @Override
    public String getInfo() {
        return "name: "+super.getName() 
                + ", price: "+super.getPrice()
                + ", year of publish: "+super.getYearOfPublish()
                + ", number of stock available: "+super.getNumberOfItemsStocked()
                + ", genre: "+super.getGenre()
                + ", album name: "+this.getDirectorName();
    }
    
}