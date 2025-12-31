package PrepInsta;
//Factorial of a Number in Java
public class P18_Factorial_Of_Num {
    public static void main(String[] args) {
        int n=3;
        int result=Fact(n);
        System.out.println(result);
    }
    static  int Fact(int n){
        if(n==0) return 1;
        return  n*Fact(n-1);
        //5*5-1=20 return

    }
}
