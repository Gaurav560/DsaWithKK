package JavaGeneralQuestion;

public class ProgramToPrintEvenLengthWordsInAString {
    public static void main(String[] args) {
        String str="hell world gaurav";
        System.out.println(print(str));
    }
    public static String print(String str){
StringBuilder newStr= new StringBuilder();
        String[] strArr=str.split(" ");
        for (String string:strArr
             ) {
            if (string.length()%2==0){
               newStr.append(string).append(" ");
            }
        }
        return newStr.toString();

    }
}
