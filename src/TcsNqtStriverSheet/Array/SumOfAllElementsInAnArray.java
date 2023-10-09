package TcsNqtStriverSheet.Array;

//using for loop
//tc:O(N) as 1 loop is used
//sc:O(1)
public class SumOfAllElementsInAnArray {
    public static void main(String[] args) {
        int[] arr={33,1,2,4,5,-5};
        System.out.println(sum(arr));

    }public static int sum(int[] arr){
        int count=0;
        for(int x:arr){
            count +=x;
        }
        return count;
    }
}
