package JavaGeneralQuestion;

public class ReverseWordsInAString {


    public static void main(String[] args) {
        String word="I have been loving you";
        //split method returns an array of strings
        String[] arr=word.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }


    }
}
