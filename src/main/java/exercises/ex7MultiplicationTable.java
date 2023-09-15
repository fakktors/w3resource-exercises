package exercises;

import java.util.Scanner;

public class ex7MultiplicationTable {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Argument for create multiplication table: ");
        int argument = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(argument + " * " + i + " = " + (argument * i));
        }
    }
}
