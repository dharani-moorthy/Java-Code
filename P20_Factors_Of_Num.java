package PrepInsta;
//Factors of a number using Java
public class P20_Factors_Of_Num {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

    }
}
