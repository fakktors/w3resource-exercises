package exercises;

public class Main {
    /*
    * For convenience, I list the method arguments in main
    * can be refactored it maybe
    * ex 1-3 and 5,9,10,11,12
    */
    public static void main(String[] args) {
        System.out.println("Hello\nAlex world!");
        calc(74, 36);
        division(50, 3);
        multiplication(25,5);
        expressionSpec9(25.5, 3.5, 40.5,4.5);
        //ex10:
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        perimeterAndArea11(7.5);
        average12(5,5,5);
        rectangle13(5.6, 8.5);

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
    public static void expressionSpec9(double a, double b, double c, double d){
        double calculate = ((a * b - b * b) / (c - d));
        System.out.println(calculate);
    }
    public static void perimeterAndArea11(double radius){
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
    public static void average12(double a, double b, double c){
        double calculateAverage = (a + b + c) / 3;
        System.out.println(calculateAverage);
    }
    public static void rectangle13(double width, double height){
        double area = width * height;
        double perimeter = 2  * (width + height);
        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);
    }
}