package PrepInsta_BasedOnNumbers;
//Octal to binary conversion using Java
public class P11_OctToBinary {
    public static void main(String[] args) {
        String a="12";
        int b=Integer.parseInt(a,8);
        String c=Integer.toBinaryString(b);
        System.out.println(c);
    }
}
