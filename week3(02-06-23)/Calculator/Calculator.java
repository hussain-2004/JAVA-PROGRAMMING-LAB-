//localhost:hussain2004
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        int a,b,ch;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = s1.nextInt();
        System.out.println("Enter second number : ");
        b = s2.nextInt();
        System.out.println("Enter Choice \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulos");
        ch = s3.nextInt();
        switch(ch){
            case 1:
                System.out.println("a+b = "+(a+b));
                break;
            case 2:
                System.out.println("a-b = "+(a-b));
                break;
            case 3:
                System.out.println("a*b = "+(a*b));
                break;
            case 4:
                System.out.println("a/b = "+(a/b));
                break;
            case 5:
                System.out.println("a%b = "+(a%b));
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
