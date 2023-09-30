package JavaGeneralQuestion;

import java.util.Arrays;

public class DeleteElementFromAnArray {
    public static void main(String[] args) {
        int[] originalArr={2,4,6,8,10,22};
        int elementToRemove=4;
        int[] newArray=removeElement(originalArr,elementToRemove);
        System.out.println(Arrays.toString(newArray));

    }
    public static int[] removeElement(int[] arr, int element){
        int[] newArr=new int[arr.length-1];
        int index=0;
        for (int x:arr
             )
        {
            if (element!=x)
             {
                 newArr[index]=x;
                 index++;
        }

        }
        return newArr;
    }
}
