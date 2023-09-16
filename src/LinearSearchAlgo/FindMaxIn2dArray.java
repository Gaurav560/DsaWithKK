package LinearSearchAlgo;

public class FindMaxIn2dArray {
    static  int search(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column]>max){
                    max=arr[row][column];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr={{3,5,65,11},{-5,0,555,222},{23,55,11,666}};
        System.out.println(search(arr));
    }
}
