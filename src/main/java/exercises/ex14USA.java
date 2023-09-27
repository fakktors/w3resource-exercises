package exercises;

public class ex14USA {
        public static void main(String[] args) {
            int countFlag = 0;
            String [] flag = new String[3];
            flag [0] = "* * * * * * ==================================";
            flag [1] = " * * * * *  ==================================";
            flag [2] = "==============================================";
            for (int i = 0; i < 2; i++) {
                System.out.println(flag[0]);            
                for (int j = 0; j < 1; j++) {
                        System.out.println(flag[1]);
                }
            }
            System.out.println(flag[0]);
            while(countFlag < 6){
                System.out.println(flag[2]);
                countFlag++;
            }
    }
}
