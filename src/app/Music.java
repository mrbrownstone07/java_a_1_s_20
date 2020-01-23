package app;

/**
 * Music
 */
public class Music extends StockableProduct{
    private String albumName;
    private String artistName;

    public Music(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, int numberOfItemsStocked) {
        super(name, productId, price, isRentable, yearOfPublish, genre, numberOfItemsStocked);
    }
    
    public Music(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, int numberOfItemsStocked,
            String albumName, String artistName) {
        super(name, productId, price, isRentable, yearOfPublish, genre, numberOfItemsStocked);
        this.albumName = albumName;
        this.artistName = artistName;
    }

    public String getAlbumName() {return albumName;}
    public void setAlbumName(String albumName) {this.albumName = albumName;}
    public String getArtistName() {return artistName;}
    public void setArtistName(String artistName) {this.artistName = artistName;}

    @Override
    public String getInfo() {
        return "name: "+super.getName() 
                + ", price: "+super.getPrice()
                + ", year of publish: "+super.getYearOfPublish()
                + ", number of stock available: "+super.getNumberOfItemsStocked()
                + ", genre: "+super.getGenre()
                + ", album name: "+this.getAlbumName()
                + ", artist name: "+this.getArtistName();
    }
    
}