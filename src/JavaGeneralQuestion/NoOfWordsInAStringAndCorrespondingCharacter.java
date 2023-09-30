package JavaGeneralQuestion;

public class NoOfWordsInAStringAndCorrespondingCharacter
{
    public static void main(String[] args)
    {
        String str="i am going to win this war";
      find(str);
    }



    public static void find(String string){
String[] strArr=string.split(" ");
        System.out.println("No of words in the string is:"+strArr.length);
        for (String str:strArr

             ) {
            System.out.println(str+"-"+str.length());
        }



    }
}
