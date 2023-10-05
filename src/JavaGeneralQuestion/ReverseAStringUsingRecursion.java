package JavaGeneralQuestion;

public class ReverseAStringUsingRecursion {
    public static void main(String[] args) {
        String str="Gaurav";
        System.out.println( recursiveString(str));
    }
    private static String recursiveString(String str){
        if (str.length()<=1 || str==null){
            return str;
        }else
            //1 index se substring start hoga end tak .
            return recursiveString(str.substring(1))+ str.charAt(0);
    }
}
