package PrepInsta_BasedOnNumbers;
//Replace all 0’s with 1 in a given integer using Java
public class P16_Replace_0_and_1 {
    public static void main(String[] args) {
        int num=706120678;
        String str=""+num;
        System.out.println(Integer.parseInt(str.replace("0","1")));
    }
}