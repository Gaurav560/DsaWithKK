package StriverSheetDsa.LearnTheBasics.Hashing;


import java.util.Scanner;

public class CountIntegersFrequency {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,4,1,5,4,6,33,4,2,1,1,4,6};
       calculateFrequencyOfAnIntegerInAnArray(arr);
        
    }
    public static void calculateFrequencyOfAnIntegerInAnArray(int[] n){
        Scanner scanner=new Scanner(System.in);
        int[] countFreq=new int[34];

        //pre computation
        for (int j : n) {
            countFreq[j] += 1;

        }
        int q;
        System.out.println("enter the no of elements for which you want to find the frequency::");
        q=scanner.nextInt();
        while(q--!=0){
            int s;
            System.out.println("enter the element value for which u want to find the frequency:: ");
            s=scanner.nextInt();
            System.out.println("the frequency for "+s+" is::"+countFreq[s]);

        }
    }
}
