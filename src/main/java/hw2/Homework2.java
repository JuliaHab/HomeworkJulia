package hw2;

public class Homework2 {
    public static void main(String[] args) {

        // Логистичесик е операторы и условные операторы

        int a = 100;
        int x = 12;
        int d = 12;
        int c = 122;

        boolean zz1 = a==d;
        System.out.println("zz1 = " + zz1);

        boolean zz2 = x==d;
        System.out.println("zz2 = "+ zz2);

        boolean zz3 = c>=a;
        System.out.println("zz3 = "+ zz3);

        boolean zz4 = x>=d;
        System.out.println("zz4 = "+ zz4);

        boolean zz5 = (d==c) || (x==d);
        System.out.println("zz5 = "+zz5);

        boolean xx6 = (c>x) && (d>=x);
        System.out.println("zz6 = "+ zz5);

        boolean zz7 = (a>x) || (a>c);
        System.out.println("zz7 = "+ zz7);

        boolean zz8 = (a==c) && (c==d);
        System.out.println("zz8 = "+ zz8);

        boolean zz9 = (c==c) && (a>=a);
        System.out.println("zz9 = "+ zz9);

        boolean zz10 = (x>a) && (c==d);
        System.out.println("zz10 = "+ zz10);

        boolean zz11 = (c>a) && (x>d);
        System.out.println("zz11 = "+ zz11);

        boolean zz0 = (c>c) || (a<=a);
        System.out.println("zz0 = "+ zz0);

       if (x>=7) {
           System.out.println("True");
        } else {
            System.out.println("False");}

        if (x<d) {
            System.out.println("Practic 1");
        } else if (x>=a) {
            System.out.println("Practic 2");
        } else {
            System.out.println("Practic 3");}


    }
}
