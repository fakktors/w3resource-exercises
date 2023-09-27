import java.util.Scanner;

public class ex17BinaryCalc {
    public static void main(String[] args){
        String a = "10";
        String b = "11";
        
        int num1 = Integer.parseInt(a, 2); 
        int num2 = Integer.parseInt(b, 2);
        int calc = num1 + num2;
        int averCalc = num1 * num2;
        
        System.out.println(Integer.toBinaryString(calc));
        System.out.println(Integer.toBinaryString(averCalc));
    }
}
