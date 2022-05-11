package hw5;

public class Homework5two {

    // функуция Sum2, которая возвращает результат
    public static void main(String[] args) {

        System.out.println(Sum2(5,7));
        System.out.println(Sum2(7,-64));
        System.out.println(Sum2(75,-33));

        int res = Sum2(98,-1007);

        System.out.println(res);
    }
    public static int Sum2 (int k, int m) {
        int sum = k + m;
        return sum;
    }
}
