package PrepInsta;
//Abundant Number or not in Java
/*
Example
Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number.
 */
public class P27_Abundant_Num {
    public static void main(String[] args) {
        int x=28;
        int sum=0;
        int temp=x;
        for (int i = 1; i <x ; i++) {
            if(x%i==0){
                sum+=i;
            }
        }
        if(sum>temp){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}
