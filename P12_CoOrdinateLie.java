package PrepInsta_BasedOnNumbers;
//Java program to find out the quadrant in which the given co-ordinate lie
/*
If ( x>0 and y>0 ) First Quadrant
If ( x<0 and y>0 ) Second Quadrant
If ( x<0 and y<0 ) Third Quadrant
If ( x>0 and y>0 ) Fourth Quadrant
If ( x=0 and y=0 ) Origin
If ( x!=0 and y=0 ) x-axis
If ( x>0 and y>0 ) y-axis
 */
public class P12_CoOrdinateLie {
    public static void main(String[] args) {
        int x=-5,y=-2;
        if(x==0&&y==0){
            System.out.println("Origin");
        } else if (x>0&&y>0) {
            System.out.println("I");
        } else if (x>0&&y<0) {
            System.out.println("II");
        } else if (x<0&&y<0) {
            System.out.println("III");
        } else if (x>0&&y<0) {
            System.out.println("IV");
        } else if (x!=0 && y==0) {
            System.out.println("X-axis");
        } else if (y!=0&&x==0) {
            System.out.println("Y-axis");
        }
    }
}
