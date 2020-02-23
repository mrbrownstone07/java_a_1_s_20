package app;

/**
 * Music
 */
public class Music extends StockableProduct{
    private String artistName;

    public Music(String name, double price, int yearOfPublish, String genre, double discount, int numberOfItemsStocked) {
        super(name, price, yearOfPublish, genre, discount, numberOfItemsStocked);
    }
    
    public Music(String name, double price, int yearOfPublish, String genre, double discount, int numberOfItemsStocked, String artistName) {
        super(name, price, yearOfPublish, genre, discount, numberOfItemsStocked);
        this.artistName = artistName;
    }

    public String getArtistName() {return artistName;}
    public void setArtistName(String artistName) {this.artistName = artistName;}

    @Override
    public String getInfo() {
        return "Album: "+super.getName() 
                + ", price: "+super.getPrice()
                + ", discount: "+super.getDiscount()
                + ", year of publish: "+super.getYearOfPublish()
                + ", number of stock available: "+super.getNumberOfItemsStocked()
                + ", genre: "+super.getGenre()
                + ", artist name: "+this.getArtistName()
                + ", product id: "+ super.getProductId();
    }
    
}
