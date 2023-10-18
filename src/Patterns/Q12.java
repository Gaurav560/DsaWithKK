package Patterns;

public class Q12 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0 || j == 7){
                    System.out.print("1");
                }
                else if(i>0&&j==1||i>0&&j==6){
                    System.out.print("2");
                }

                else if (i>1&&j==2||i>1&&j==5){
                    System.out.print("3");
                }
               else if (i == 3){
                    System.out.print("4");
                }
               else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}
