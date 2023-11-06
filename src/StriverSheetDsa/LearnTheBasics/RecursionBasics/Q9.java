package StriverSheetDsa.LearnTheBasics.RecursionBasics;

public class Q9 {
    public static void main(String[] args) {
        //fibonacci series
        System.out.println(findFibonacci(6));

    }public static int findFibonacci(int n){
       if (n<=1)return n;
       return findFibonacci(n-1)+findFibonacci(n-2);
    }

}
