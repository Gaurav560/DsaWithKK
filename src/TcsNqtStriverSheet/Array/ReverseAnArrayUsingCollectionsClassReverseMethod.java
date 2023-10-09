package TcsNqtStriverSheet.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseAnArrayUsingCollectionsClassReverseMethod
{
    public static void main(String[] args) {
        Integer[] arr={44,222,11,23,2,1};
        reverse(arr);
    }
    public static void reverse(Integer[] arr){
        //list only takes objects as inputs so we converted the whole Array into Integer array
        //conversion from array to list is done by Arrays.asList(pass the array)
        List<Integer> list= Arrays.asList(arr);
        //reverse method of collection class
        Collections.reverse(list);
        System.out.println(list);
    }
}
