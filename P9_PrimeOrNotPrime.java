package PrepInsta;
//Write a program to check if a given number is prime or not in java
public class P9_PrimeOrNotPrime {
    public static void main(String[] args) {
        int num = 55;
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }
}