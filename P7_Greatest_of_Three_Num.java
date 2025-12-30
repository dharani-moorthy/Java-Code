package PrepInsta;
//Find the Greatest of the three Numbers in Java
public class P7_Greatest_of_Three_Num {
    /*
    public static void main(String[] args) {
        int a,b,c;
        a=20;
        b=30;
        c=2;
        if(a>b&&a>c){
            System.out.println(a);
        } else if (b>a&&b>c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
        */
    public static void main(String[] args) {
        int a=20; int b=30;int c=3;
        int result=Math.max(a,b);
        int aa=Math.max(result,c);
        System.out.println(aa);

    }
    }

