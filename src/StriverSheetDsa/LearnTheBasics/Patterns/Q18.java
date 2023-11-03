package StriverSheetDsa.LearnTheBasics.Patterns;

public class Q18 {
    public static void main(String[] args) {
        char ch='E';
        for (int i = 1; i <=5 ; i++) {
            char temp=ch;
            for (int j = 1; j <=i; j++) {

                System.out.print(temp);
                if (i>1){temp++;}

            }
            System.out.println();
            ch--;
        }

    }
}
