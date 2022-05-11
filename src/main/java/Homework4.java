public class Homework4 {
    public static void main(String[] args) {

     int [] house = {2,76,9,90,31,76,6,88,21,12};

     // выводим все значения через foreach
     for (int i: house) {
         System.out.println(i);
     }

     // выводим только четные
     for (int j: house) {
         if (j%2==0) {
             System.out.println(j);
         }
     }

     // выводим значения, которые делятся без остатка на 3
     for (int k : house) {
         if (k%3==0) {
             System.out.println(k);
         }
     }

    // находим максимальное значение
    int max = house[0];
     for (int l : house){
         if (l>max) {
             max = l;
         }
     }
        System.out.println("max = "+ max);

    // находим минимальное значение
     int min = house[0];
     for (int m : house) {
         if (m<min){
             min = m;
         }
     }
        System.out.println("min = "+ min);

     // выводим нечетные числа
     for (int h : house) {
         if (h%2==1) {
             System.out.println(h);
         }
     }

     // вывести индексы равные 10
     int[] index = {10,15,12,7,88,10,6,17,23,10,10,16};
     int indexof = 0;
     for (int b : index) {
         if (b == 10) {
             System.out.println(indexof);
         }
         indexof++;
     }

    }
}
