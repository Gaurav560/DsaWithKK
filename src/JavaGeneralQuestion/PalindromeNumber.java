package JavaGeneralQuestion;

public class PalindromeNumber {

    public static boolean checkPalindrome(int n){

        int temp=n;
        int remainder=0;
        int reverse=0;
        while (n>0){
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        return temp == reverse;


    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(checkPalindrome(n));
    }
}
