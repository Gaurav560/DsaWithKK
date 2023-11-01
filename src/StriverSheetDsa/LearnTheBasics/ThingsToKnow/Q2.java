package StriverSheetDsa.LearnTheBasics.ThingsToKnow;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        switch (str) {
            case "Float", "Integer" -> System.out.println("4 bytes");
            case "Long", "Double" -> System.out.println("8 bytes");
            case "Character" -> System.out.println("1 bytes");
        }
    }
}
