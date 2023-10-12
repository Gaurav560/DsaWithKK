package TcsNqtStriverSheet.Numbers;



public class PrimeNumberInAGIvenRange {
    public static void main(String[] args) {

      int[] arr={2,1,0,5,11,444,55};
      find(arr);

    }
    public static void find(int[] arr){
        System.out.println("Prime numbers in the array are::");
        for (int n : arr) {
            boolean b = true;
            int m = n / 2;
            if (n > 1) {
                for (int j = 2; j <= m; j++) {
                    if (n % j == 0) {
                        b = false;
                        break;
                    }
                }
            } else {
                b = false;
            }

            if (b) {
                System.out.print(n + " ");
            }
        }

    }

}
