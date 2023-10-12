package TcsNqtStriverSheet.Numbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no to check prime: ");
        int n= scanner.nextInt();
if (find(n)){
    System.out.println("prime ");
}else System.out.println("not prime");
    }
    public static boolean find(int n){
        boolean b=true;
       int m=n/2;
       if (n>1)

       {
           for(int i=2;i<=m;i++){
               if (n%i==0){
                   b=false;
                   break;
               }
           }
       }
       else {
           b=false;
       }
        return b;

    }

    }

