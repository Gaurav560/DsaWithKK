package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

public class Q4 {
    public static void main(String[] args) {
        //gcd-greatest common divisor or hcf(brute force approach)
        System.out.println(gcd(11,3));

    }
    public  static int gcd(int num1,int num2){
        int ans=1;
        for (int i = 1; i <=Math.min(num1,num2) ; i++) {
            if (num1%i==0&&num2%i==0){
                ans=i;
            }

        }
        return ans;
    }
}
