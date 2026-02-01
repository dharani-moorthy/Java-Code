package PrepInsta_BasedOnNumbers;
//Java Code to Count Possible Decoding Of A Given Digit Sequence
public class P18_Count_Decoding_Digit_Sequence {
    public static void main(String[] args) {
        String s = "12122";
        char[] dig = s.toCharArray();
        System.out.println(Decode(dig, s.length()));
    }
    public static int Decode(char[] dig, int a) {
        if (a == 0 || dig[0] == '0') return 0;
        int[] cnt = new int[a + 1];
        cnt[0] = 1;
        cnt[1] = 1;
        for (int i = 2; i <= a; i++) {
            cnt[i] = 0;
            if (dig[i - 1] != '0') {
                cnt[i] += cnt[i - 1];
            }
            int twoDigit = (dig[i - 2] - '0') * 10 + (dig[i - 1] - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                cnt[i] += cnt[i - 2];
            }
        }
        return cnt[a];
    }
}