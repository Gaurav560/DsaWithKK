package TcsNqtStriverSheet.Array;

import java.util.ArrayList;

public class LeftRotateAnArrayUsingArrayListOptimised {
    //left rotation
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(3);
        int k=3;
        k %=arrayList.size();
        int n=arrayList.size();
        rotate(arrayList,0,k-1);
        rotate(arrayList,k,n-1);
        rotate(arrayList,0,n-1);
        System.out.println(arrayList);

    }public static void rotate(ArrayList<Integer> arr,Integer start,Integer end){
        while (start<=end){
       int temp=arr.get(start);
       arr.set(start,arr.get(end));
       arr.set(end,temp);
       start++;
       end--;
        }
    }
}
