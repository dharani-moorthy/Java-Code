package PrepInsta_BasedOnNumbers;
//Binary to octal conversion using Java
public class P10_Bin_To_Oct {
    public static void main(String[] args) {
        String a="1010";
        int b=Integer.parseInt(a,2);
        String c=Integer.toOctalString(b);
        System.out.println(c);
    }
}
