package JavaGeneralQuestion;

public class VowelsInAString {
    public static void main(String[] args)
    {
        String str="skeeper is a good girl";
        System.out.println(noOfVowels(str));

    }public static int noOfVowels(String str){
        int noOfVowels=0;
        for (char c:str.toCharArray()
             ) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> noOfVowels++;
            }
        }
        return noOfVowels;
    }
}
