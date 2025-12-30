package PrepInsta;
//Check if a Number is Positive or Negative in Java
public class P1_PosOrNeg {
    /*
        public static void main(String[] args) {
        int num=0;
        if(num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }
}
     */
    public static void main(String[] args) {
        int num=-3;
        if(num == 0){
            System.out.println("Zero");
        }else {
            String result= num > 0 ? "postive":"Negative";
            System.out.println(result);
        }
//? is used for if and else
    }
}