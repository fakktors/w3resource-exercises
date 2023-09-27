package exercises;

public class ex8JAVA {
    public static void main (String[] args){
        
        String[] java = new String[4];
        
        java [0] = "   J    a   v     v  a";
        java [1] = "   J   a a   v   v  a a";
        java [2] = "J  J  aaaaa   V V  aaaaa";
        java [3] = " JJ  a     a   V  a     a";

        for (int i = 0; i < 4; i++){
            System.out.println(java[i]);
        }
    }
}
