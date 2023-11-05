package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(prime(scanner.nextInt()));
    }
    public static Object prime(int n){
        boolean b=true;
        if (n>=2){
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                b=false;
                break;
            }

        }
        return b;

    }else return null;
    }
}
