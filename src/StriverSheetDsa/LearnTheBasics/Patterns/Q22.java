package StriverSheetDsa.LearnTheBasics.Patterns;

public class Q22 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=7 ; j++) {
                if (i==7||j==7||i==1||j==1){
                    System.out.print("4  ");
                }else if (j==2||j==6||i==2||i==6){
                    System.out.print("3  ");
                } else if (j==3||j==5||i==3||i==5) {
                    System.out.print("2  ");
                } else {
                    System.out.print("1  ");
                }

            }
            System.out.println();

        }
    }
}
