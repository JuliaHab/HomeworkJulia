package hw6;

public class Homework6one {
    public static void main(String[] args) {
        int [] value = {2,3,5,6,7,8};

        int plus = sum(value);
        System.out.println(plus);
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for (int i: numbers) {
            sum+=i;
        }
        return sum;
    }
}

