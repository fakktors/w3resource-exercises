package exercises;

public class calculateOperations {

    public static void main (String[] args){
        calculation(125, 24, 1);
    }
    public static void calculation (int operandOne, int operandTwo, int seqNumber){
        switch (seqNumber){
            case 1:
                System.out.println(operandOne + operandTwo);
            case 2:
                System.out.println(operandOne - operandTwo);
            case 3:
                System.out.println(operandOne * operandTwo);
            case 4:
                System.out.println(operandOne / operandTwo);
            case 5:
                System.out.println(operandOne % operandTwo);
            default:
        }
    }
}
