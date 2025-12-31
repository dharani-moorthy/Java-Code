package PrepInsta;
//Strong Number Program in Java
/*
Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
*/
public class P22_Strong_Num {
    public static void main(String[] args) {
        int n=145;
        int orginal=n;
        int sum=0;
        while (n!=0){
           int rem=n%10;
           sum=sum+fact(rem);
           n/=10;
        }
        if(sum==orginal){
            System.out.println("it is an strong number");
        }
        else{
            System.out.println("not an strong number");
        }
    }
    static int fact(int num){
        int f=1;
        for(int i=2;i<=num;i++){
            f*=i;
        }
        return f;
    }
}
