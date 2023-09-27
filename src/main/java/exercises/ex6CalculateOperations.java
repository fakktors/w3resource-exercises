package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ex6CalculateOperations {

    public static void main (String[] args){
        calculation(125, 24);
    }
    public static void calculation (int operandOne, int operandTwo){
        int operation [] = {125, 24};
        Arrays.parallelPrefix(operation, (x, y) -> x * y);
        System.out.println(operation);
          
        }
}
