package StriverSheetDsa.LearnTheBasics.RecursionBasics;

public class Q2 {
    public static void main(String[] args) {

        int n=5;
        printName(1,5);
    }public static void printName(int i,int n){
        //base condition
        if(i<=n){
            System.out.println("my name is gaurav and u are the best");
            i++;
            printName(i,n);
        }
    }
}
