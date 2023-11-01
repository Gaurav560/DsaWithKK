package StriverSheetDsa.LearnTheBasics.ThingsToKnow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fibonacciSeriesResult(n));
    }
    public static int fibonacciSeriesResult(int n)
    {
        int fib1=1;
        int fib2=1;
        int res=1;
        if (n>=1 &&n<=10000){
        if (n==1||n==2){
            return res;
        }else {
            res=fibonacciSeriesResult(n-1)+fibonacciSeriesResult(n-2);

        }

    }
        return res ;
    }
}
