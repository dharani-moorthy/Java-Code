package PrepInsta;
//Find the Fibonacci Series up to Nth Term in Java Language
public class P16_Fibonacci_Series {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=15;
        System.out.println(a);
        System.out.println(b);
        int temp;
        for (int i = 2; i <n; i++) {
            temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
        }
    }
}
