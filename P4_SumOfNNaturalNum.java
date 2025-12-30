package PrepInsta;
//Find the Sum of N Natural Numbers in Java
public class P4_SumOfNNaturalNum {
    public static void main(String[] args) {
        int s=6;
        int e=10;
        int sum=getSum(s,e);
        System.out.println(sum);
    }
    static  int getSum(int s,int e){
        if(s>e) return 0;
        return s+getSum(s+1,e);
    }
}
