package exercises;

import java.util.Scanner;

public class ex15swap {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            String c = a;
            a = b;
            b = c;
            System.out.println("argument one = " + a + "\narument two = " + b);
    }
}
