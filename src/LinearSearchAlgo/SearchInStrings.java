package LinearSearchAlgo;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str="Gaurav";
        char target='g';
        System.out.println(search(str,target));
    }

    private static boolean search(String str, char target) {
        if(str.length()==0){
        return false;
        }
//        for (int i = 0; i < str.length(); i++) {
//            if (target==str.charAt(i)){
//                return true;
//            }
//        }
//for each loop is applied on array only ,so we have to convert the string to array first
        for (char ch: str.toCharArray()
             ) {if (target==ch){
                 return true;
        }
            
        }
        return  false;

    }
}
