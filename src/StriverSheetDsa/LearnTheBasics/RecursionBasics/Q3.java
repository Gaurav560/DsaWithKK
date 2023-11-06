package StriverSheetDsa.LearnTheBasics.RecursionBasics;

public class Q3 {
    public static void main(String[] args) {
int i=1;int n=6;
printUpToN(i,n);
    }public static void printUpToN(int i,int n){
        if (i>n)return;
        System.out.println(i);
        printUpToN(i+1,n);
    }
}
