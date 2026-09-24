package Lab1;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Sort {
    public static void main(String[] args) {
        Integer[] a = { 2, 3, 45, 5, 4, 2, 3, 23, 1, 3, 46, 45, 56, 7, 8, 8, 97, 2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));


    }

    /**
     * 1- assuming that the first element is the minimum
     * 2- we compare to
     *
     *
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swaped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) break;
        }

    }

    public static <T extends Comparable<T>> void exchangeSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for(int i =0 ; i< arr.length ; i++){
            int minIndex = i ;
            for(int j=i+1 ; j< arr.length ; j++){
                if(arr[j].compareTo(arr[minIndex])<0 ){
                    minIndex = j ;
                }
            }
            if(minIndex!=i){
                T temp = arr[minIndex] ;
                arr[minIndex] = arr[i] ;
                arr[i]=temp ;
            }
        }
    }


    public static <T extends Comparable<T> > void insertionSort(T[]arr){

        for(int i =1 ; i< arr.length ; i++) {
            T temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                    arr[j+1] = arr[j] ;
                    j-- ;
            }
            arr[j+1] = temp ;
        }



        }

    }








