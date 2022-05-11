package hw6;

public class Homework6twoversion2 {
    public static void main(String[] args) {

        int [] numbers = {3,9,1,8,4,8,5};
        sort (numbers);
    }
    public static void sort (int [] arr){
        // первый элемент минимальный, и сравнивается с остальными элементами в массиве
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            // замена элемента на минимаьный
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
            System.out.println(arr[i]);
        }
    }
}
