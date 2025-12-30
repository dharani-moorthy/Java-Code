package PrepInsta;
//Check Whether or Not the Year is a Leap Year in Java
public class P8_LeapYear {
    public static void main(String[] args) {
        int a=2021;
         if(a%400==0){
             System.out.println("leap year");
         } else if (a%4==0&&a%100!=0) {
             System.out.println("leap year");
             
         }else{
             System.out.println("Not a Leap year");
         }
    }
}
