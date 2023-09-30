package JavaGeneralQuestion;

import java.util.Arrays;

public class CheckWhetherAStringIsAnagramOrNot {
    public static void main(String[] args) {
        String str1="play";
        String str2="lapy";
        System.out.println(checkAnagram(str1,str2));
    }
    public static boolean checkAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

}
