package StriverSheetDsa.LearnTheBasics.Hashing;

import java.util.Scanner;

public class CharactersFrequencyInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String str=sc.next();

        hashing(str);
    }
    public static void hashing(String str){
        Scanner sc=new Scanner(System.in);
        int[] hash=new int[27];
        for (int i = 0; i <str.length() ; i++) {
            hash[str.charAt(i)-'a'] += 1;
        }
        int n;
        System.out.println("enter the no of queries u want to run ::");
        n= sc.nextInt();
        while(n--!=0){
            System.out.println("enter the first character for which u want to find the frequency::");

            char ch=sc.next().charAt(0);
            System.out.println("the frequency of "+ch+ " in given string is "+hash[ch-'a']);

        }

    }
}
