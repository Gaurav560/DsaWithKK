package TcsNqtStriverSheet.Numbers;


//tc:O(N) and sc:O(1)
public class APSumUsingBruteForce2 {
    public static void main(String[] args) {
        int a=2;int n=4;int d=2;int sum=0;
        for (int i = 0; i <n ; i++) {
            sum +=a;
            a +=d;
        }
        System.out.println(sum);
    }
}
