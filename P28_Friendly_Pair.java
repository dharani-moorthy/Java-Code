package PrepInsta;
//Friendly pair or not (amicable or not) using Java
public class P28_Friendly_Pair {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 140;
        double nums1 = getnums1(num1);
        double nums2=getnums1(num2);
        if(nums1==nums2){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
    static double getnums1(int num){
        int sum=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                sum=sum+i;
            }
        }
    return (double) sum/num;
    }
}
