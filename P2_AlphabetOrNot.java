package PrepInsta_Operation_on_String;
//Java program to check a character is an alphabet or not
public class P2_AlphabetOrNot {
    public static void main(String[] args) {
        char ch;
        ch='5';
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("Alphabet");
        }else {
            System.out.println("Number");
        }
    }
}

