package PrepInsta;
//Find all the Prime Numbers in a Given Interval in Java
public class P10_Prime_No_In_Given_Interval {
    public static void main(String[] args) {
        int s = 2;
        int e = 10;
        for (int i = s; i <= e; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }static boolean isprime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;

            }
        }





