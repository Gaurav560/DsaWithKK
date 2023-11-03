package StriverSheetDsa.LearnTheBasics.Patterns;

public class Q19 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10 ; j++) {
                if (i == 1 || i == 2 && j <= 4 || i == 2 && j >= 7 || i == 3&&j<=3 ||i==3 &&j>=8||i==4&&j<=2||i==4 &&j>=9||i==5&&j==1||i==5&&j==10||i==6&&j==1||i==6&&j==10||i==7&&j<=2||i==7&&j>=9||i==8&&j<=3||i==8&&j>=8||i==9&&j<=4||i==9&&j>=7||i==10){
                    System.out.print(" "+"*"+" ");
                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
    }
}
