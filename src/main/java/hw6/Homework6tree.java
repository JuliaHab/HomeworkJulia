package hw6;

public class Homework6tree {
    public static void main(String[] args) {
        int [] flo = {3,9,1,8,4,-8,5};

        System.out.println(min(flo));

    }

    public static int min(int[] minx){
        int min = minx[0];
        for (int i: minx){
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
