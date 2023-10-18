package Patterns;

public class Q15 {
    public static void main(String[] args) {
        for (int i = 5; i >0; i--) {
            char ch='A';
            for (int j = 0; j <i ; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
