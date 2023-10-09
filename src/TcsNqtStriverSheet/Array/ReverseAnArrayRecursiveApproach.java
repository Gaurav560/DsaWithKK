package TcsNqtStriverSheet.Array;

public class ReverseAnArrayRecursiveApproach {
    //tc:O(N)
    //sc:O(1)
    public static void main(String[] args) {
        int[] arr={3,5,4,2,1,544,22};
        recursiveReverseApproach(arr,0, arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }

    } public static void recursiveReverseApproach(int[] arr,int startIndex,int endIndex){

       if (startIndex<endIndex)
       {
           int temp=arr[startIndex];
           arr[startIndex]=arr[endIndex];
           arr[endIndex]=temp;
recursiveReverseApproach(arr,startIndex+1,endIndex-1);
       }








    }
}
