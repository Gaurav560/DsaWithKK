import java.util.HashSet;
import java.util.Set;

public class CheckiftheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
      //hashset does not allow duplicate elements.
        Set<Character> set=new HashSet<>();
        for (char ch:sentence.toCharArray()
             ) {
            if (ch>='a' && ch<='z'){
                set.add(ch);
            }
        }return set.size()==26;
    }

    public static void main(String[] args) {
        String Pangram="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(Pangram));
    }
}
