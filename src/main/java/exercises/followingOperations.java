package exercises;

public class followingOperations {

    public static void main(String[] args){
        expression1(-5, 8, 6);
        expression2(55, 9);
        expression3(20, -3, 5, 8);
        expression4(5, 15, 3, 2, 8);
    }
    public static void expression1(int a, int b, int c){
        int calculate = a + b * c;
        System.out.println(calculate);
    }
    public static void expression2(int a, int b){
        int calculate = (a + b) % b;
        System.out.println(calculate);
    }
    public static void expression3(int a, int b, int c, int d){
        int calculate = a + b * c / d;
        System.out.println(calculate);
    }
    public static void expression4(int a, int b, int c, int d, int e){
        int calculate = a + b / c * d - e % c;
        System.out.println(calculate);
    }
}