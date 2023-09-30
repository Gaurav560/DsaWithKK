package JavaGeneralQuestion;

import java.util.HashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args)
    {
        String str="Gaurav";
        System.out.println(removeDuplicates(str));

    }
    public static String removeDuplicates(String string){
        HashSet<Character> hashSet=new HashSet<>();
        StringBuilder newString=new StringBuilder();
        char[] characters=string.toCharArray();
        for (char ch:characters
             ) {
            hashSet.add(ch);
        }
        for (Character c:hashSet){
newString.append(c);
        }
return newString.toString();
    }
}
