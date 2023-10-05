package JavaGeneralQuestion;



import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitAStringInJava {
    public static void main(String[] args) {

        //1st method
        //using split method of string
        //this split method  of String class returns an array of String
        String str="Gaurav-Sharma";
     String[] strArr=str.split("-");
        System.out.println(Arrays.toString(strArr));

        //2nd method
//splitting string using Pattern class compile method
      List<String> stringList=Pattern.compile("-").splitAsStream(str).collect(Collectors.toList());
        System.out.println(stringList);


        //3rd method
        //splitting the string using string tokenizer
        //delimiter is the character on the basis of which you want to split the string
        StringTokenizer stringTokenizer=new StringTokenizer(str,"-");
        while(stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextToken());


        }
    }
}
