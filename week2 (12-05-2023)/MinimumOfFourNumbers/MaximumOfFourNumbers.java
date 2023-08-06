import java.util.*;
class MaximumOfFourNumbers {
    public static void main(String args[]){
        int a,b,c,d;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Four Numbers : ");
        a = s1.nextInt();
        b = s1.nextInt();
        c = s1.nextInt();
        d = s1.nextInt();
        if(a>=b && a>=c && a>=d){
            System.out.println("Maximum = "+a);
        }
        else if(b>=a && b>=c && b>=d){
            System.out.println("Maximum = "+b);
        }
        else if(c>=a && c>=b && c>=d){
            System.out.println("Maximum = "+c);
        }
        else{
            System.out.println("Maximum = "+d);
        }
    }
}
