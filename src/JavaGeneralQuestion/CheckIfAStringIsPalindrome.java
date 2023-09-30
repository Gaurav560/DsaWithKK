package JavaGeneralQuestion;

public class CheckIfAStringIsPalindrome {
    public static void main(String[] args) {
        String str="rhr";
        System.out.println(stringPalindrome(str));


    }
    public static boolean stringPalindrome(String str){
        char[] chars=str.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            stringBuilder.append(chars[i]);

        }
       String newStr= stringBuilder.toString();
        return str.equals(newStr);
    }
}
