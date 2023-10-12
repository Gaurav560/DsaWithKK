package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number up to which u want to find the sum::");
        int num= scanner.nextInt();
        findSum(num);
    }
    public static void findSum(int n){

        int sum=0;
        if (n>0){
        for (int i = 1; i <=n; i++) {
            sum +=i;
        }
            System.out.println("sum of all natural numbers is:: "+sum);
    }
       else System.out.println("n is not a natural number");
    }

}
