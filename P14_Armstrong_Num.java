package PrepInsta;
//Check Whether or Not the Number is an Armstrong Number....
public class P14_Armstrong_Num {
    public static void main(String[] args) {
        int n = 371;
        int rev = 0, rem;
        int orginal = n;
        while (n != 0) {
            rem = n % 10;
            rev =rev+rem*rem*rem;
            n /= 10;
        }
        if(rev==orginal){
            System.out.println("it is an Armstrong number");
        }else {
            System.out.println("Not an Armstrong number");
        }
    }
}
