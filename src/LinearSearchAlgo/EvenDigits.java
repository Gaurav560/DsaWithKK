package LinearSearchAlgo;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits
{

    static int findNumbersWithEvenNoOfDigits(int[] nums)
    {
       int count=0;
        for (int x:nums
             ) {
if (even(x)){
    count++;
}
        }
        return count;
    }

   //fn to check whether a number contains even no of digits or not
    private static boolean even(int x) {
        return noOfDigits(x) % 2 == 0;
    }
    private static int noOfDigits(int x) {
        if (x<0){
            x=x*-1;
        }
        if (x==0){
            return 1;
        }
        //two ways to count no of digits in number:
        //1. count the no of digits
        //2.convert into string and count the length
        int count=0;
        while(x>0){
            count++;
            x=x/10;

        }
        return count;}

    public static void main(String[] args) {
        int[] arr={12,345,2,6,-7896};
        System.out.println(findNumbersWithEvenNoOfDigits(arr));
    }
    }



