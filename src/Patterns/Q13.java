package Patterns;

public class Q13 {
    public static void main(String[] args) {
        int start=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {

                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}
