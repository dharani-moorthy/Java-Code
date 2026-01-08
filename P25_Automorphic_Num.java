package PrepInsta;
//Automorphic Number in Java
public class P25_Automorphic_Num {
    public static void main(String[] args) {
        int x=5;
        int  b=x*x;
        if(b%10==x%10){
            System.out.println("Yes, it is Automorphic");
        }else {
            System.out.println("No,it is not Automorphic");
        }
    }
}
