package TcsNqtStriverSheet.Array;

public class RemoveDuplicatedInAnSortedArrayTwoPointerApproach {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,4};
        int k=arr(arr);
        System.out.println(k);
        for (int i = 0; i <k; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static int arr(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            while(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }

        }

        return i+1;
    }
}
