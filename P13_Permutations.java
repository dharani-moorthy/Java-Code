package PrepInsta_BasedOnNumbers;
//Permutations in which n people can occupy r seats in a classroom in java
public class P13_Permutations {
    public static void main(String[] args) {
        int n,per,r,fact1,fact2;
        n=5;
        r=9;
        fact1=1;
        for (int i = n; i >1 ; i=i-1) {
            fact1=fact1*i;
        }
        fact2=1;
        int num;
        num=n-r;
        for (int i = num; i >1 ; i=i-1) {
            fact2=fact2*i;
        }
        per=fact1/fact2;
        System.out.println(per);
    }
}
