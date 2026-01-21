package PrepInsta_BasedOnNumbers;
//Program to calculate GCD of Two Numbers in Java
public class P3_GCD_Of_Two_Num {
    public static void main(String[] args) {
        int num1=12;
        int num2=30;
        int res=aa(num1,num2);
        System.out.println(res);
    }
    public static int aa(int a,int b){
        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
