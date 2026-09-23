package Lab1;
//Task :Create a class Product(int id, String name, double price)
// .Write a generic export utility: public static <T> void exportToFile(List<T> list, String filename).Read standard CSV data using Scanner
// , map lines into Product objects, and dump them to a new file using your generic exporter.

import java.util.HashMap;
import java.util.Map;

public class Product {
    private int id ;
    private String name ;
    private double price ;

    public Product(){}
    public Product(int id ,String name, double price){
        this.id = id ;
        this.name = name;
        this.price = price ;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name ;
    }

    public double getPrice(){
        return price ;
    }



    public void setId(int d){
        id = d ;
    }


    public void setName(String n){
        name=n ;
    }


    public void setPrice(double p ){
        price = p ;
    }


    //Overriding the toString method achieving a readable format when exporting to a new file

    //Json ????

    @Override
    public String toString(){
        Map<String , String> map = new HashMap<>() ;
        map.put("id", String.valueOf(id)) ;
        map.put("name", name) ;
        map.put("price", String.valueOf(price)) ;
        return map.toString() ;
    }
}
