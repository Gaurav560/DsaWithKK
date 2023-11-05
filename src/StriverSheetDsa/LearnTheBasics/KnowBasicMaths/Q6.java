package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //print all the divisors
        Scanner scanner=new Scanner(System.in);
        print(scanner.nextInt());
    }
    public static void print(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
