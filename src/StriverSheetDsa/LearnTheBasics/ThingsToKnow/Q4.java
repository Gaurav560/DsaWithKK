package StriverSheetDsa.LearnTheBasics.ThingsToKnow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
final double pi=3.14159265358979323846;
int len,breadth,ch;
double radius;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 for finding area of circle and 2 for finding area of rectangle::");
        ch=scanner.nextInt();

        switch (ch) {
            case 1 -> {
                System.out.println("enter the radius of the circle::");
                radius = scanner.nextDouble();
                System.out.println("the area of circle is ::" + pi * radius * radius);
            }
            case 2 -> {
                System.out.println("enter the length of the rectangle::");
                len = scanner.nextInt();
                System.out.println("enter the breadth of the rectangle::");
                breadth = scanner.nextInt();
                System.out.println("the area of rectangle is ::" + len * breadth);
            }
        }
    }
}
