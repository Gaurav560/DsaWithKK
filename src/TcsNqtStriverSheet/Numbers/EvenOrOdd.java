package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

//tc:O(1) and sc:O(1)
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number u want to check as even or odd::");
        int num= scanner.nextInt();

        evenOrOdd(num);
    }public static void evenOrOdd(int n){
        if (n%2==0){
            System.out.println("even number");
        }else System.out.println("odd number");
    }
}

