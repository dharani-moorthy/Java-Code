package PrepInsta_BasedOnNumbers;
import java.util.Scanner;
//Occurrence of a digit in a given number using Java
public class P24_Occurrence_Of_Digit_In_Given_Number {
    public static void main(String[] args) {
        int a=23423233;
        int count=0;
        Scanner b=new Scanner(System.in);
        System.out.println("Enter the required digits:");
        int d=b.nextInt();
        while (a>0) {
            int rem = a % 10;
            if(rem==d) {
                count++;
            }
              a/=10;

        }
        System.out.println(count);
    }
}
