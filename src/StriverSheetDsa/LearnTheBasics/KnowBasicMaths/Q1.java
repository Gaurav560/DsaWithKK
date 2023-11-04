package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

public class Q1 {
    public static void main(String[] args) {
        int n=345654432;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
