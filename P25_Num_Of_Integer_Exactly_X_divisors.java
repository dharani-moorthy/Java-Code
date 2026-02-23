package PrepInsta_BasedOnNumbers;
//Finding number of integers which has exactly X divisors
/*
- 1 → Divisors: [1] → 1 divisor
- 2 → [1, 2] → 2 divisors ✅
- 3 → [1, 3] → 2 divisors ✅
- 4 → [1, 2, 4] → 3 divisors
- 5 → [1, 5] → 2 divisors ✅
- 6 → [1, 2, 3, 6] → 4 divisors
- 7 → [1, 7] → 2 divisors ✅
So, numbers with exactly 2 divisors: 2, 3, 5, 7 → Total = 4
 */
public class P25_Num_Of_Integer_Exactly_X_divisors {
    public static void main(String[] args) {
        int n=7;
        int x=2;
        int count =0;
        for (int i = 1; i <=n; i++) {
            int c=0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    c++;
                }
            }
            if(c==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
