package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;
import java.util.Scanner;

// Reading and writing from files
public class Files {
    public static void main(String[] args) {
        // 1- reading from a file using scanner object



       /*Scanner input ;
         try {
            input = new Scanner(new File("/home/moistmaher/input-file"));
            while (input.hasNext()){
                System.out.println(input.nextLine());
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }*/

        // try with resources(closable Classes )



       /* try(Scanner in = new Scanner(new File("/home/moistmaher/input-file"))){
            while(in.hasNext()){
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } */

        // writing in files using prinwriter

      /*  try(PrintWriter writer = new PrintWriter(new File("/home/moistmaher/out-file"))){
            writer.print("this input is written via java program");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } */


        // Practice : copy a file content into a new file

        try(
                Scanner input = new Scanner(new File("/home/moistmaher/input-file")) ;
                PrintWriter writer = new PrintWriter(new File("/home/moistmaher/out-file"))
                ) {


            while(input.hasNext()){
                writer.println(input.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }






    }
}
