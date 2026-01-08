package PrepInsta;
//Check for Perfect Square in Java
public class P24_Perfect_Square {
    public static void main(String[] args) {
        int x=4;
            int a = (int) Math.sqrt(x);
            int b = a * a;
            if (b == x) {
                System.out.println(true);
            }else {
                System.out.println(false);
            }
    }

}


