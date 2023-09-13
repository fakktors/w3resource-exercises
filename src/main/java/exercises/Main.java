package exercises;

public class Main {
    /*
    * For convenience, I list the method arguments in main
    * can be refactored it maybe
    * ex 1-3 and 5
    */
    public static void main(String[] args) {
        System.out.println("Hello\nAlex world!");
        calc(74, 36);
        division(50, 3);
        multiplication(25,5);
    }
    public static void calc(int argOne, int argTwo){
        int calculate = argOne + argTwo;
        System.out.println(calculate);
    }
    public static void division(int argOne, int argTwo){
        int calculate = argOne / argTwo;
        System.out.println(calculate);
    }
    public static void multiplication(int argOne, int argTwo){
        int calculate = argOne * argTwo;
        System.out.println(calculate);
    }
}