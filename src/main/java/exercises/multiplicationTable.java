package exercises;

import java.util.Scanner;

public class multiplicationTable {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Argument for create multiplication table: ");
        int argument = in.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(argument + " * " + i + " = " + (argument * i));
        }
    }
}
