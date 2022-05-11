package hw6;

import java.util.Arrays;

public class Homework6two {
    public static void main(String[] args) {

        int [] numbers = {3,9,1,8,4,8,5};

        sort(numbers);
    }

    public static void sort (int[] arr) {
        Arrays.sort(arr);                   // используем сортировку которая есть в коллекции Java
        for (int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
            }
        }
    }


