package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

//tc:O(1) and sc:O(1)
public class EvenOddWithBitWiseAndOperator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number u want to check as even or odd::");
        int num= scanner.nextInt();

        evenOrOddCheck(num);

    }public static void evenOrOddCheck(int n){
        if ((n &1)==0) System.out.println("even number");
        else System.out.println("odd number");
    }


}
