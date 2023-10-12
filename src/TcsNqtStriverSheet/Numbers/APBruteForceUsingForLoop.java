package TcsNqtStriverSheet.Numbers;

public class APBruteForceUsingForLoop {
    public static void main(String[] args) {
        int n=4;
        int[] arr=new int[n];
        int a=2;
       int  d=2;
int sum = 0;
arr[0]=a;
        for (int i = 1; i <n ; i++) {
arr[i]=arr[i-1]+d;
        }
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
