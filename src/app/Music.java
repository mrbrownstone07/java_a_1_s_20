package app;

/**
 * Music
 */
public class Music extends StockableProduct{
    private String artistName;

    public Music(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, double discount, int numberOfItemsStocked) {
        super(name, productId, price, isRentable, yearOfPublish, genre, discount, numberOfItemsStocked);
    }
    
    public Music(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, double discount, int numberOfItemsStocked, String albumName, String artistName) {
        super(name, productId, price, isRentable, yearOfPublish, genre, discount, numberOfItemsStocked);
        this.artistName = artistName;
    }

    public String getArtistName() {return artistName;}
    public void setArtistName(String artistName) {this.artistName = artistName;}

    @Override
    public String getInfo() {
        return "name: "+super.getName() 
                + ", price: "+super.getPrice()
                + ", discount: "+super.getDiscount()
                + ", year of publish: "+super.getYearOfPublish()
                + ", number of stock available: "+super.getNumberOfItemsStocked()
                + ", genre: "+super.getGenre()
                + ", artist name: "+this.getArtistName();
    }
    
}