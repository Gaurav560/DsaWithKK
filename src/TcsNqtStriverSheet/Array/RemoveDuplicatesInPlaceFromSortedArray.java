package TcsNqtStriverSheet.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//brute force
//set in order to insert elements takes log(N) and for inserting N elements
//it will take NlogN and for inserting back to array from set takes tc (N)
//sc:O(N)
public class RemoveDuplicatesInPlaceFromSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};

        int k=  removeDuplicates(arr);
        for (int i = 0; i <k ; i++) {
            System.out.print(arr[i]+" ");
        }

    }public static int removeDuplicates(int[] arr){

        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        //converted hashset to array list
        List<Integer> list=new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);

        }
      //  System.out.println(Arrays.toString(arr));
        return set.size();
    }
}
