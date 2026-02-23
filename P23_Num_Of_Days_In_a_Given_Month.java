package PrepInsta_BasedOnNumbers;
import java.util.Scanner;
//Counting number of days in a given month of a year
public class P23_Num_Of_Days_In_a_Given_Month {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the month:");
        int month= a.nextInt();
        System.out.println("Enter the year:");
        int year =a.nextInt();
        if(month==0) {
            System.out.println("Invalid"+" "+year);
        }else if(month==2&&(year%4==0)||((year%100!=0)&&(year%400==0))){
            System.out.println(29 +"days");
        } else if (month==2) {
            System.out.println(28+"days");
        } else if (month==1||month==3||month==5||month==7||month==9||month==11) {
            System.out.println(30+"days");
        }else {
            System.out.println(31+"days");
        }
    }
}
