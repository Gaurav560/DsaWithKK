package TcsNqtStriverSheet.Array;

import java.util.Arrays;


//tc: O(N) for filling the new array by Integer.MIN_VALUE +O(N*N) FOR NESTED LOOPS
//+O(N) for looping the new array
//total tc:O(N)+O(N*N)+O(N)=O(2N)+O(N*N)=O(N)+O(N*N)
//SPACE COMPLEXITY:O(N) for using an extra space

public class FindAllRepeatingElementsInAnArrayBruteForce {
    public static void main(String[] args)
    {
int[] arr={1,1,0};
findRepeatedElements(arr);
       
    }
    public static void findRepeatedElements(int[] arr)
    {
int[] newArr=new int[arr.length];
//to fill an entire array use Arrays.fill
        Arrays.fill(newArr, Integer.MIN_VALUE);

        for(int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
arr[j]=Integer.MIN_VALUE;
newArr[i]=arr[i];


                }

            }

        }
        for (int j : newArr) {
            if (j != Integer.MIN_VALUE)
                System.out.print(j + " ");


        }

        
        
        
        
    }
}
