package StriverSheetDsa.LearnTheBasics.KnowBasicMaths;

import java.util.Scanner;

public class Q5 {
    //armstrong number
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(find(scanner.nextInt()));
    }
    public static int find(int n){
        double count=0;
        int temp=n;
        while (temp>0){
            temp=temp/10;
            count++;
        }
      //  System.out.println(count);

        double sum=0;
        while (n>0){
            sum=sum+Math.pow( n%10,count);
            n=n/10;
        }
        return (int)sum;
    }

}
