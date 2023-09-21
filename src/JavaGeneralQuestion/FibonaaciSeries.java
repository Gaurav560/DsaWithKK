package JavaGeneralQuestion;

public class FibonaaciSeries {
    public static int main(int a,int b){
        int i=0;
        int ans=0;
        while(i<5){
        ans=a+b;
        a=b;
        b=ans;
        i++;}
        return ans ;

    }
    public static void main(String[] args) {
        //return 7 the digit of fibonacci series
        int a=0,b=1;
        System.out.println(main(a,b));
    }
}
