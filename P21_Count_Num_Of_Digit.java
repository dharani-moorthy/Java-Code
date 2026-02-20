package PrepInsta_BasedOnNumbers;
//Java Code to find number of digits in an integer
public class P21_Count_Num_Of_Digit {
    public static void main(String[] args) {
        int a = 35421;
        int count = 0;
        while (a != 0) {
           int b= a % 10;
            count++;
            a=a/10;
        }
        System.out.println(count);
    }
}
