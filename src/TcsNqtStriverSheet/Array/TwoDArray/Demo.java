package TcsNqtStriverSheet.Array.TwoDArray;

public class Demo {




    public static void main(String[] args) {

       int[][] arr= new int[][]{{2, 4, 6}, {3, 6, 3}};
        print2D(arr);
    }
    public static void print2D(int[][] arr){

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

}
