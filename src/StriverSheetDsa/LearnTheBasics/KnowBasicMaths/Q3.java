package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

public class Q3 {
    public static void main(String[] args) {
        //palindrome check(aage aur peeche se number same hoga )
        int n=151;
        int reverse=n;
        int temp=0;

        while(n>0){
            temp=(n%10)+temp*10;
            n=n/10;

        }
        if (temp==reverse){
            System.out.println("yes palindrome");
        }else {
            System.out.println("no not palindrome ");
        }
    }
}
