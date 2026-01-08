package PrepInsta;
//Program for Finding out the Prime Factors of a number in Java
public class P21_Prime_Factor {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 2; i <= n; i++) {
                while (n%i== 0) {
                    System.out.println(i);
                    n/=i;
                }
        }
    }
}

