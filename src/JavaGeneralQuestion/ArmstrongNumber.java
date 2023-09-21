package JavaGeneralQuestion;

public class ArmstrongNumber {
    public static boolean checkArmstrong(int num){
        //integer to string with the help of Integer.toString(int num)

//Integer.parseInt(String s) to convert string to integer
int originalNum=num;
       int temp=originalNum;
       int sum=0;
       int remain=0;
       while (originalNum>0){
           remain=originalNum%10;
           sum=sum+remain*remain*remain;
           originalNum=originalNum/10;
       }
        return temp == sum;


    }
    public static void main(String[] args) {
int num=153;
        System.out.println(checkArmstrong(num));
    }
}
