package StriverSheetDsa.LearnTheBasics.Patterns;

public class Q12 {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=8 ; j++) {
                if (j == 1 || j == 8){
                    System.out.print("1");
                } else if (i>=2 &&j==2 ||i>=2&& j==7) {
                    System.out.print("2");
                } else if (i>=3&&j==3 || i>=3&&j==6) {
                    System.out.print("3");
                }else if (i == 4){
                    System.out.print("4");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
