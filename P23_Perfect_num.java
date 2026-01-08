package PrepInsta;
//Perfect Number Program in Java
/*
Example
Input : 6
Output : Yes, it's a Perfect Number
Since, 6 = 1 + 2 + 3 (which are its divisors)
 */
public class P23_Perfect_num {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for (int i = 1; i <n ; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
            if(sum==n){
                System.out.println("yes, it's a perfect number");
            }else {
                System.out.println("it is not a perfect number");
            }

        }
    }

