package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
int[] res=new int[index.length];
        for (int i = 0; i < index.length; i++) {
       list.add(index[i],nums[i]);


        }
        for (int j = 0; j < list.size(); j++) {
            res[j]= list.get(j);
        }
        return res;
    }



    public static void main(String[] args) {
int[] nums={0,1,2,3,4};
int[] index={0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }

}
