package StriverSheetDsa.LearnTheBasics.Patterns;

public class Q17 {
    public static void main(String[] args) {

        for (int i = 0; i <4 ; i++) {
            int breakPoint=(2*i+1)/2;
            char ch='A';
            for (int j = 4; j >i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print(ch);
                if (j<breakPoint)ch++;
                else   ch--;

            }
            System.out.println();
        }

        }
    }

