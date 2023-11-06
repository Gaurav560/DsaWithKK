package StriverSheetDsa.LearnTheBasics.RecursionBasics;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        //check if a string is palindrome or not by recursive approach
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
        System.out.println(checkPalindrome(str,0));
    }
    public static boolean checkPalindrome(String str,int i){
if (i>=str.length()/2)return true;
if (str.charAt(i)!=str.charAt(str.length()-1-i))return false;
return checkPalindrome(str,i+1);



    }
}
