package PrepInsta_BasedOnNumbers;
//Can a number be expressed as a sum of two prime numbers using Java?
public class P17_sum_Of_Two_Prime_num {
    public static void main(String[] args) {
        int n=14;
        check(n);
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }
    public static void check(int n){
        for (int i = 2; i <n ; i++) {
            if(isPrime(i)&&isPrime(n-i)){
                System.out.println(n+"="+i+"+"+(n-i));
                return;
            }
        }
    }
}
