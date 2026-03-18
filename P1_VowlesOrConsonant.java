package PrepInsta_Operation_on_String;
import java.util.Scanner;
//Java Program to check a character is a Vowel or Consonant
/*
Take character input from the user
Check if Input is a lowercase or upper case vowel
If yes then print vowel
If not then print consonant
Can also additional check if it’s a non-character item
 */
public class P1_VowlesOrConsonant {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        char c=a.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
