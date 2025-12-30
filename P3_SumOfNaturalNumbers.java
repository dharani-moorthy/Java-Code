package PrepInsta;
//Find the Sum of First N Natural Numbers in Java
public class P3_SumOfNaturalNumbers {
    /*
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }*/
  //  using recursion
public static void main(String[] args) {
    int n=5;
    int sum=getSum(n);
    System.out.println(sum);
}
static int getSum(int n){
    if (n==0) return  n;
    return n+getSum(n-1); // it will repeat the process
    /*
    recursion
    n+n-1=5+5-4=9
    9+4-1=12
    12+3-1=14
    14+2-1=15
    formula: n*(n+1)/2
    5*(5+1)/2=30/2=15
     */

}
}
