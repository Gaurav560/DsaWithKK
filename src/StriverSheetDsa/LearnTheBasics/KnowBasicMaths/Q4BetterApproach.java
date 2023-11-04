package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

import java.util.Scanner;

public class Q4BetterApproach {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int num1= scanner.nextInt();
        System.out.println("enter 2nd number");
        int num2= scanner.nextInt();
        for (int i =Math.min(num1,num2); i >=1 ; i--) {
            if (num1%i==0&&num2%i==0){
                System.out.println("gcd is ::"+i);
                break;
            }
        }

    }
}
