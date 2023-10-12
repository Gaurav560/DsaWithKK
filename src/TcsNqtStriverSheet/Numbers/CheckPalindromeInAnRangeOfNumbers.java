package TcsNqtStriverSheet.Numbers;



public class CheckPalindromeInAnRangeOfNumbers {
    public static void main(String[] args) {
      int[] arr={121,0,-666,4545,4444,221,1221};
        find(arr);
    }
    public static void find(int[] arr){
        for(int n:arr){
            int temp=n;
            int rem,num=0;

        while(n>0){
            rem=n%10;
            num=(num*10)+rem;
            n=n/10;
        }
       if (temp == num && temp!=0){
           System.out.print(temp+" ");
       }
        }
    }
}
