package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number u want to check as perfect::");
        int num= scanner.nextInt();
        if(findPerfect(num)){
            System.out.println("perfect number ");
        }else System.out.println("not perfect");

    }
    public static boolean findPerfect(int n){
        if (n>0){
        int sum=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                sum +=i;
            }
        }
        return sum == n;
    }
    else return false;
    }

}

