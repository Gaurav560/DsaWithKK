package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number u want to check as positive or negative::");
        int num= scanner.nextInt();
        check(num);
    }public static void check(int n){if (n>0){
        System.out.println("positive number");
    } else if (n<0){
        System.out.println("negative numbers");
    }else System.out.println("neither -ve or +ve number");
    }
}
