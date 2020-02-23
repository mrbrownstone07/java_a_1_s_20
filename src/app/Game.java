package app;

/**
 * Game
 */
public class Game extends StockableProduct{
    private String nameOfDeveloper;
    
    public Game(String name, double price,  int yearOfPublish, String genre, double discount) {
        super(name, price, yearOfPublish, genre, discount);
    }

    public Game(String name, double price,  int yearOfPublish, String genre, double discount, int numberOfItemsStocked) {
        super(name, price, yearOfPublish, genre, discount, numberOfItemsStocked);
    }

    public Game(String name, double price,  int yearOfPublish, String genre, double discount, int numberOfItemsStocked,
    String nameOfDeveloper) {
        super(name, price, yearOfPublish, genre, discount, numberOfItemsStocked);
        this.nameOfDeveloper = nameOfDeveloper;
    }

    public String getNameOfDeveloper() {return nameOfDeveloper;}
    public void setNameOfDeveloper(String nameOfDeveloper) {
        this.nameOfDeveloper = nameOfDeveloper;
    }

    @Override
    public String getInfo() {
        return "Game: "+super.getName() 
                + ", price: "+super.getPrice()
                + ", discount: "+super.getDiscount()
                + ", year of publish: "+super.getYearOfPublish()
                + ", number of stock available: "+super.getNumberOfItemsStocked()
                + ", genre: "+super.getGenre()
                + ", developed by: "+this.getNameOfDeveloper()
                + ", product id: "+ super.getProductId();
    }
}
