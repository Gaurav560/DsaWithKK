package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

//tc:O(N)
//sc:O(1)
public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no to check armstrong: ");
        int n = scanner.nextInt();
        if(find(n)){
            System.out.println("armstrong number");
        }else {
            System.out.println("not armstrong number");
        }

    }
            public static boolean find( int n){
        int temp=n;
        int newTemp=temp;
        int count=0;
        double sum=0;


        while (n>0){
            n=n/10;
            count++;
        }

        while(newTemp>0){
          int rem=newTemp%10;
            sum=sum+Math.pow(rem,count);
            newTemp=newTemp/10;
        }
                return sum == temp;


            }


        }
