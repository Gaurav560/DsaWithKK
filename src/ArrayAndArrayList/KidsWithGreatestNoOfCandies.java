package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        
        List<Boolean> result=new ArrayList<>();
        for (int candy:candies
             ) {
            if (candy+extraCandies>=max){
                result.add(true);
            }else result.add(false);

        }
        return result;
    }
     public static void main(String[] args) {
        
int[] arr={2,3,5,1,3};
int extra=3;
         System.out.println(kidsWithCandies(arr,extra));
    }
}
