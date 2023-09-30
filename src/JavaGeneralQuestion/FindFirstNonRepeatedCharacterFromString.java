package JavaGeneralQuestion;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacterFromString {

    public static void main(String[] args) {
//Linked hashmap is used to preserve the insertion order of key value pair other
        //wise use hashmap
        String str="aaabbcdddefff";
        System.out.println(find(str));


    }
    public static char find(String str){
        char[] ch=str.toCharArray();
        LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap<Character, Integer>(str.length());
        for (char c:ch
        ) {
            linkedHashMap.put(c,linkedHashMap.containsKey(c)?linkedHashMap.get(c)+1:1);
        }

        for (Entry<Character,Integer> entry:linkedHashMap.entrySet()
        ) {
            if (entry.getValue()==1)
            {
                return entry.getKey();
            }
        }throw new RuntimeException("did not find any non repeated characters");


    }
}
