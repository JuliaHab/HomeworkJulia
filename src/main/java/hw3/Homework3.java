package hw3;

public class Homework3 {
    public static void main(String[] args) {

        // Массивы

        int [] center = {5,2,7,1,80,33,40};
        System.out.println(center[0]);
        System.out.println(center[1]);
        System.out.println(center[2]);
        System.out.println(center[3]);
        System.out.println(center[4]);
        System.out.println(center[5]);
        System.out.println(center[6]);

        // Выводим масив с помощью цикла

        int [] house = new int[] {5,2,7,1,80,33,40};
        for (int i : house) {
        System.out.println(i);}

        // Создание пустого массива

        String [] animals = new String[5];
        animals [0] = "Lion";
        animals [1] = "Cat";
        animals [2] = "Dog";
        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);
        System.out.println(animals[3]);
        System.out.println(animals[4]);

        // условный путой массив

        boolean [] valeu = new boolean[4];
        valeu [0] = 5>=7;
        valeu [1] = 54<55;
        valeu [2] = true;
        valeu [3] = false;
        System.out.println(valeu[0]);
        System.out.println(valeu[1]);
        System.out.println(valeu[2]);
        System.out.println(valeu[3]);

        // length - длинна массива (количесво)

        System.out.println(valeu.length);

        // последнее значение массива

        System.out.println(valeu [valeu.length-1]);


    }
}
