package PrepInsta_Operation_on_String;
//Java Program to find length of the string without using length function
public class P4_Find_Length_Of_String {
    public static void main(String[] args) {
        int len=0;
        String a="Dharani";
        for(char b:a.toCharArray()){
            len++;
        }
        System.out.println(len);
    }
}
