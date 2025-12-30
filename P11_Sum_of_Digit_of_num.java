package PrepInsta;
//Find the Sum of the Digits of a Number in Java Language
public class P11_Sum_of_Digit_of_num {
    public static void main(String[] args) {
        int n = 2345;
        int result = getsum(n);
        System.out.println(result);
        /*
        int sum=0;
    while (n!=0){
        sum=sum+n%10;
        n=n/10;
    }
        System.out.println(sum);
         */
    }
    static int getsum(int n){
        if(n==0) return 0;
        return (n%10)+getsum(n/10);
    }
}
