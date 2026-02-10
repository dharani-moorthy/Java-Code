package PrepInsta_BasedOnNumbers;
import java.util.Scanner;
//Java Program for calculating the Area of a circle
//3.14*r*r
public class P19_Area_Of_Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        double Area=3.14*r*r;
        System.out.println(Area);
    }
}
