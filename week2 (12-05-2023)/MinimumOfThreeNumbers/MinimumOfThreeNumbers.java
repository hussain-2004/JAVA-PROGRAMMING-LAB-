import java.util.*;
class MinimumOfThreeNumbers {
    public static void main(String args[]){
        int a,b,c;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        a = s1.nextInt();
        b = s1.nextInt();
        c = s1.nextInt();
        if(a<=b && a<=c){
            System.out.println("Minimum = "+a);
        }
        else if(b<=a && b<=c){
            System.out.println("Minimum = "+b);
        }
        else{
            System.out.println("Minimum = "+c);
        }


    }
}
