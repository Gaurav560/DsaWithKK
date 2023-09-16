package LinearSearchAlgo;

public class FIndMinIn2dArray {
    static  int search(int[][] arr){
        int minValue=Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < minValue) {
                    minValue = anInt;
                }
            }
        }
        return minValue;
}

    public static void main(String[] args) {

        int[][] arr={{3,5,65,11},{-5,0,555,222},{23,55,11,666}};
        System.out.println(search(arr));
    }

}
