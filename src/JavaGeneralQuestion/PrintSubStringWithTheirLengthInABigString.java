package JavaGeneralQuestion;

public class PrintSubStringWithTheirLengthInABigString {
    public static void main(String[] args) {
        String str="Hello World is the first thing ";
        count(str);

    }
    public static void count(String str){
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            StringBuilder str1= new StringBuilder();

            while(i< ch.length && ch[i]!=' '){
                str1.append(ch[i]);
              i++;

            }
            System.out.println(str1+" ->>"+str1.length());
        }

    }
}
