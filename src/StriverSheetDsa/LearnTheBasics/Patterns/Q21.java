package StriverSheetDsa.LearnTheBasics.Patterns;

public class Q21 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (i==1||i==7||i==3&&j==1||i==3&&j==4||i==5&&j==1||i==5&&j==4){
                    System.out.print(" "+"*"+" ");
                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
    }
}
