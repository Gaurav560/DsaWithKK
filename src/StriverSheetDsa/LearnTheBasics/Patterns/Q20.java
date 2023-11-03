package StriverSheetDsa.LearnTheBasics.Patterns;

public class Q20 {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9 ; j++) {
                if (i==1&&j==1||i==1&&j==9||i==2&&j<=2||i==2&&j>=8||i==3&&j<=3||i==3&&j>=7||i==4&&j<=4||i==4&&j>=6||i==5||i==6&&j<=4||i==6&&j>=6||i==7&&j<=3||i==7&&j>=7||i==8&&j<=2||i==8&&j>=8||i==9&&j==1||i==9&&j==9){
                    System.out.print(" "+"*"+" ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
