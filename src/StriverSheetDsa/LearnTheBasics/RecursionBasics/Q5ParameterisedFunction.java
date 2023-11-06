package StriverSheetDsa.LearnTheBasics.RecursionBasics;

public class Q5ParameterisedFunction {
    public static void main(String[] args) {
int n=5;
int sum=0;
sumN(n,sum);
    }
    public static void sumN(int n,int sum){
if (n<1){
    System.out.println(sum);
    return;
}
sumN(n-1,sum+n);
    }
}
