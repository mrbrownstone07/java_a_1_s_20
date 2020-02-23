package app;

public class App {
    public static void main(String[] args) throws Exception {
        Music m1 = new Music("submarine", 20, 2011, "Indie", 10, 100, "Alex Turner");
        Music m2 = new Music("AM", 10, 2013, "Indie", 5.5, 10, "Arctic Monkeys");
        Music m3 = new Music("Tranquility Base Hotel and Casino", 23, 2018, "Indie", 7.5, 500, "Arctic Monkeys");
        Music m4 = new Music("Rust in Peace", 33, 1990, "Metal", 2.5, 10, "Megadeth");
        Music m5 = new Music("Abbey Road", 25, 1969, "Rock", 7.8, 5, "The Beatles");
        Music m6 = new Music("The Dark Side of the Moon", 35, 1973, "Progressive Rock", 2.5, 10, "Pink Floyd"); 

        Movie v1 = new Movie("Good Will Hunting", 12, 1997, "Drama", 5.4, 123, "Gus Van Sant");
        Movie v2 = new Movie("Life Is Beautiful", 20, 1997, "Comedy-Drama", 2.6, 126, "Roberto Benigni");
        Movie v3 = new Movie("what's eating gilbert grape", 20, 1993, "Drama", 6.4, 122 ,"Lasse Hallstrom");
        Movie v4 = new Movie("The Godfather", 15, 1972, "Crime", .01, 125, "Francis Ford Coppola");
        Movie v5 = new Movie("The Rainmaker", 5, 1997, "Crime", 12, 127, "Francis Ford Coppola");
        Movie v6 = new Movie("Apocalypse Now", 24, 1979, "Drama", 4.9, 121, "Francis Ford Coppola");
        Movie v7 = new Movie("Leon the Professional", 21, 1994, "Drama", 2.7, 124, "Luc Besson");

        Game g1 = new Game("Red Dead Redemption 2", 29, 2018, "Survival", 3.7, 560, "RockStar");
        Game g2 = new Game("God of War", 12, 2018, "Action", 5.6, 567, "Javaground");
        Game g3 = new Game("Grand Theft Auto V", 13, 2017, "Action", 2.3, 565, "RockStar");

        Inventory i = new Inventory();

        i.addItem(m1); i.addItem(m2); i.addItem(m3); i.addItem(m4); i.addItem(m5); i.addItem(m6);
        i.addItem(v1); i.addItem(v2); i.addItem(v3); 
        i.addItem(v4); i.addItem(v5); i.addItem(v6); 
        i.addItem(v7); i.addItem(g1); i.addItem(g2); i.addItem(g3);

    //    Invoice inv_dis = new Invoice();

    //    inv_dis.addProduct(i.getProduct(m1.getProductId()));
    //    inv_dis.addProduct(i.getProduct(m2.getProductId()));
    //    inv_dis.addProduct(i.getProduct(v1.getProductId()));
    //    inv_dis.addProduct(i.getProduct(v2.getProductId()));
    //    inv_dis.addProduct(i.getProduct(g1.getProductId()));
    //    inv_dis.addProduct(i.getProduct(g2.getProductId()));
    //    System.out.println(inv_dis.getInvoice());

                
        for (StockableProduct sp : i) {
            if(sp.getClassFlag() == 0)
                System.out.println(sp.getName());
        }


        i.sortByPrice();
        for(StockableProduct sp : i) {
            if(sp.getClassFlag() == 0){
                System.out.println(sp.getName() + " -> " + sp.getPrice());
                break;  
            }
        }

        for(StockableProduct sp: i){
            if(sp.getClassFlag() == 1){
                String str[] = sp.getInfo().split(", ");
                for(String a : str){
                    if(a.contains("director")){
                        String str2[] = a.split("director: ");
                        if(str2[1].equalsIgnoreCase("Francis Ford Coppola")){
                            System.out.println(sp.getName());
                        }
                    }
                }
            }
        }
   

        
    }
}
