package StriverSheetDsa.LearnTheBasics.ThingsToKnow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
  evenOddSum(n);

    }
    public static void evenOddSum(int n)
    {
        int evenSum=0;
        int oddSUm=0;
        while(n!=0){
        if ((n%10)%2==0){
            evenSum=evenSum+n%10;

            n=n/10;
        }if((n%10)%2!=0){
            oddSUm=oddSUm+n%10;
n=n/10;
        }}
        System.out.println("sum of even numbers is ::"+evenSum);
        System.out.println("sum of odd numbers is ::"+oddSUm);

    }
}
