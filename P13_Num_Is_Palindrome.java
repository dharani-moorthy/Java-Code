package PrepInsta;
//Check Whether or Not the Number is a Palindrome in Java Language
public class P13_Num_Is_Palindrome {
    public static void main(String[] args) {
        int n=121,rev=0,rem;
        int orginal =n;
        while (n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==orginal){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
