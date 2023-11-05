package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

import java.util.Scanner;

public class Q6OptimalApproach {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        print(scanner.nextInt());
    }

    private static void print(int nextInt) {
        for (int i = 1; i <=Math.sqrt((double) nextInt) ; i++) {
            if (nextInt%i==0){
                System.out.print(i+" ");
                if (i!=nextInt/i) System.out.print(nextInt/i+" ");
            }
        }
    }
}
