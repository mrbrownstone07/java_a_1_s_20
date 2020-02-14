package app;

/**
 * Game
 */
public class Game extends StockableProduct{
    private String nameOfDeveloper;
    
    public Game(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre) {
        super(name, productId, price, isRentable, yearOfPublish, genre);
    }

    public Game(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, int numberOfItemsStocked) {
        super(name, productId, price, isRentable, yearOfPublish, genre, numberOfItemsStocked);
    }

    public Game(String name, int productId, double price, boolean isRentable, int yearOfPublish, String genre, int numberOfItemsStocked,
    String nameOfDeveloper) {
        super(name, productId, price, isRentable, yearOfPublish, genre, numberOfItemsStocked);
        this.nameOfDeveloper = nameOfDeveloper;
    }

    public String getNameOfDeveloper() {return nameOfDeveloper;}
    public void setNameOfDeveloper(String nameOfDeveloper) {
        this.nameOfDeveloper = nameOfDeveloper;
    }

    @Override
    public String getInfo() {
        return "name: "+super.getName() 
                + ", price: "+super.getPrice()
                + ", year of publish: "+super.getYearOfPublish()
                + ", number of stock available: "+super.getNumberOfItemsStocked()
                + ", genre: "+super.getGenre()
                + ", developed by: "+this.getNameOfDeveloper();
    }
}