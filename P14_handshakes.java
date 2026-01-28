package PrepInsta_BasedOnNumbers;
import java .util.Scanner;
//Maximum number of handshakes in java
/*
For N = 8
handshakes  =  ( (N-1) * N ) / 2  =  ( 8 x 7 )/2  =  28
Print Result
 */
public class P14_handshakes {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
       int aaa= aa(n);
        System.out.println(aaa);
    }
    static int aa(int n){
        int b=((n-1)*n)/2;
        return b;
    }
}
