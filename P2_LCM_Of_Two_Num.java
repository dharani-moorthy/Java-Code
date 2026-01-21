package PrepInsta_BasedOnNumbers;
//LCM of two numbers using Java
public class P2_LCM_Of_Two_Num {
    public static void main(String[] args) {
        int num1=12;
        int num2=14;
        int c=max(num1,num2);
        System.out.println(c);
    }
    public static int max(int a,int b){
        int mmax=Math.max(a,b);
        int lcm=mmax;
        while (lcm%a!=0|| lcm%b!=0){
            lcm++;
        }
        return lcm;
    }
}
