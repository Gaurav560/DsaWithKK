package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no to check palindrome: ");
  int n= scanner.nextInt();
        System.out.println(find(n));
    }
    public static boolean find(int n){
        int temp=n;
        int rem=0;
        int num=0;
        while(n>0){
            rem=n%10;
            num=(num*10)+rem;
            n=n/10;
        }
        return temp == num;
    }
}
