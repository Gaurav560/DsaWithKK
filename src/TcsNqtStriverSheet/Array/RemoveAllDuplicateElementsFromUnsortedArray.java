package TcsNqtStriverSheet.Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveAllDuplicateElementsFromUnsortedArray {
    public static void main(String[] args) {
        int[] arr={4,3,9,2,4,1,10,89,34};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }public static int[] removeDuplicates(int[] arr){

        HashSet<Integer> hashSet=new HashSet<>();
        for (int j : arr)
        {
            hashSet.add(j);
        }
        int[] arrr=new int[hashSet.size()];
        int i=0;
       for(Integer x:hashSet){
           arrr[i++]=x;
       }
return arrr;
    }
}
