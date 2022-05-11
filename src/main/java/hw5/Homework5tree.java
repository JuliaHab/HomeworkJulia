package hw5;

public class Homework5tree {
    public static void main(String[] args) {

        boolean FF = isEven(9);

        System.out.println(FF);
        System.out.println(isEven(8));
        System.out.println(isEven(-55));
        System.out.println(isEven(0));
    }

    public static boolean isEven (int v){
        boolean vv = v%2==0;
        return vv;
    }
}
