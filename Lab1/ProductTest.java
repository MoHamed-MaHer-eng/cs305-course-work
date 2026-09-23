package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();



        try(Scanner in = new Scanner(new File("/home/moistmaher/csv"))){
            while (in.hasNext()){
                Product p = new Product() ;
                String[]strs = in.nextLine().split(",") ;
                p.setId(Integer.valueOf(strs[0]));
                p.setName(strs[1]);
                p.setPrice(Double.valueOf(strs[2]));
                products.add(p) ;
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        exportToFile(products , "/home/moistmaher/out");
    }


    public static <T> void exportToFile(List<T> list, String fileName) {
            try(PrintWriter write = new PrintWriter(fileName)){
                        for(T item : list){
                            write.println(item.toString());
                        }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }
    }
}