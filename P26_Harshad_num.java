package PrepInsta;
//Harshad number or not using Java
public class P26_Harshad_num {
    public static void main(String[] args) {
        int x=21;
        int temp=x;
        int sum=0;
        while (temp!=0){
            int a=temp%10;
            sum+=a;
            temp/=10;
        }
        if(x%sum==0){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}

