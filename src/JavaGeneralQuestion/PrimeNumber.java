package JavaGeneralQuestion;

public class PrimeNumber {
    public static boolean checkPrimeNumber(int n){
        int temp=0;
        for (int i = 2; i <(n-1)/2 ; i++) {
            if (n%i==0){
                temp++;
            }
        }
        if (temp>0){
            return false;
        }else return true;
    }
    public static void main(String[] args) {
        int n=55;
        System.out.println(checkPrimeNumber(n));
    }
}
