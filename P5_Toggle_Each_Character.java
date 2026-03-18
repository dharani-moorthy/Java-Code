package PrepInsta_Operation_on_String;
//Java program to toggle each character in a string
public class P5_Toggle_Each_Character {
    public static void main(String[] args) {
        String a="DharanimOORTHY";
        String b="";
        for (int i = 0; i <a.length() ; i++) {
            if(Character.isUpperCase(a.charAt(i))){
                b=b+Character.toLowerCase(a.charAt(i));
            }else {
                b=b+Character.toUpperCase(a.charAt(i));
            }
        }
        System.out.println(b);
    }
}
