import java.util.*;
class ArithmeticOperators {
    public static void main(String args[]){
        int a,b;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = s1.nextInt();
        System.out.println("Enter b : ");
        b = s1.nextInt();
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
        System.out.println("a % b = "+(a%b));
    }
}
