package PrepInsta;
//Find the Armstrong Numbers in a given Range using Java
public class P15_Armstrong_num_in_Range {
    public static void main(String[] args) {
        for (int i = 10; i < 1000; i++) {
            int sum = 0;
            int n = i;
            int rem;
            while (n!=0) {
                rem = n % 10;
                sum = sum + rem * rem * rem;
                n /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
