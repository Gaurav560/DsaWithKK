package TcsNqtStriverSheet.Array;


//brute force
public class FindAllNonRepeatingElementInAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,-1,1,3,1};
        nonRepeatedElement(arr);
    }public static void nonRepeatedElement(int[] arr)
    {
        boolean check;
        for (int i = 0; i < arr.length; i++) {
check=false;
            for (int j=0;j< arr.length;j++) {
                if (i!=j && arr[i] ==arr[j]) {
                    check = true;
                    break;

                }

            }
                if (!check){
                    System.out.print(arr[i]+" ");
                }


        }
    }
}
