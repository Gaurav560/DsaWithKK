package ArrayAndArrayList;

public class OptimizedNofOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int noOfGoodPairs=0;

      int[] frequencyOfEachElement=new int[101];
        for (int num:nums
             ) {
            frequencyOfEachElement[num]++;
        }
        for (int x:frequencyOfEachElement
             ) {
            noOfGoodPairs+=(x*(x-1))/2;
        }



        return noOfGoodPairs;

    }
    public static void main(String[] args) {
int[] arr={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
}
