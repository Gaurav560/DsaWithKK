package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

public class Q2 {
    public static void main(String[] args) {
        //reverse a number
        int n=45321;
        int temp=0;
        while(n>0){
temp=(n%10)+temp*10;
n=n/10;

        }
        System.out.println(temp);
    }
}
