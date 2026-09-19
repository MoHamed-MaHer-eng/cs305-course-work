package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Task :  Write a method that count occurrences of each word in file input.txt to output.txt

        // O(# lines in the files *  max line cardinality)
        try(
                Scanner input = new Scanner(new File("/home/moistmaher/input-file")) ;
                PrintWriter writer = new PrintWriter(new File("/home/moistmaher/out-file"))
                ){

            Map<String , Integer> map = new HashMap<>() ;
            while (input.hasNext()){
                String l = input.next() ;
                String[] str = l.split(" ");
                for(String s :str){
                    if(map.containsKey(s)){
                        map.put(s,map.get(s)+1) ;
                    }else map.put(s,1) ;
                }
            }

            writer.print(map);


        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }





    }
}
