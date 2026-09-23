package Lab1;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Sort {
    public static void main(String[] args) {
           Integer[]a= {1,3,5,3,6,46,45,3,4,23,2,3,5,465,11,25,5,4,7,7,899,8,8,7,8,6,56,45343};
            sort(a);
            System.out.println( Arrays.toString(a)) ;


    }
    /**
     * 1- assuming that the first element is the minimum
     * 2- we compare to 
     *
     * */
    public static <T extends Comparable<T>> void sortV1(T[] arr) {
                for(int i=0 ; i< arr.length ; i++){
                    int min = i ;
                    for(int j =i+1 ; j<arr.length ;j++){
                        if(arr[j].compareTo(arr[i])<0){
                            T temp = arr[j] ;
                            arr[j] = arr[i] ;
                            arr[i] = temp ;
                        }
                    }


                }

    }
}

