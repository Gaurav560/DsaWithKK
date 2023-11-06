package StriverSheetDsa.LearnTheBasics.RecursionBasics;

public class Q5 {
    //functional recursion
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
       if (n==0)return 0;
       return n+sum(n-1);
    }
}
