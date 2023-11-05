package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

import java.util.Scanner;

public class Q7OptimalApproach {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        prime(scanner.nextInt());
    }
    public static void prime(int n)
    {
        int count=0;
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0){
                count++;
                if (n/i!=i){
                    count++;

                }
            }


        }
        if (count==2){
            System.out.println("prime number");
        }else System.out.println("not prime number");
    }
}
