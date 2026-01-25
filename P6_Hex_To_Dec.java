package PrepInsta_BasedOnNumbers;
//Program to Convert Hexadecimal to Decimal
 /*
 Hexadecimal Range - (0, 15)
With numbers (0 - 9) represented as is
And 10 - A, 11 - B, 12 - C, 13 - D, 14 - E, 15 - F
  */
public class P6_Hex_To_Dec {
    public static void main(String[] args) {
        String a="1F";
        int dec=Integer.parseInt(a,16);
        System.out.println(dec);
    }
}
