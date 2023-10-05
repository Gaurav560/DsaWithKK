package JavaGeneralQuestion;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String str1="ShwetaB##";
        String str2="ShwetaB##";
        System.out.println(compare(str1,str2));
    }public static boolean compare(String str1,String str2){
     char[] chars=   str1.toCharArray();
     char[] chars1=   str2.toCharArray();
     if (chars1.length==chars.length){
         for (int i = 0; i < str1.length(); i++) {
             for (int j = 0; j < str2.length(); j++) {
                 if (chars[i]!=chars1[i])
                 {
                     return false;
                 }

             }

         }return true;
     }
     else return false;

    }
}
