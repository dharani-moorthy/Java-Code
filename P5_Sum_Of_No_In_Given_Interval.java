package PrepInsta;
//Find the Sum of the Numbers in a Given Interval in Java
public class P5_Sum_Of_No_In_Given_Interval {
    public static void main(String[] args) {
        //using formula
        int s=6;
        int e=10;
        int sum=0;
        sum=(e*(e+1)/2)-(s*(s+1)/2)+s;
        System.out.println(sum);


    }
}
