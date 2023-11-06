package StriverSheetDsa.LearnTheBasics.RecursionBasics;

public class Q4 {
    public static void main(String[] args) {
        int i=1;int n=5;
        printReverse(1,5);
    }
    public static void printReverse(int i,int n){
        if (i>n)return;
        System.out.println(n);
        printReverse(i,n-1);
    }
}
