import java.util.*;
class Factorial {
    public static void main(String args[]){
        int n,f=1,i;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = s1.nextInt();
        for(i=1;i<=n;i++){
            f = f*i;
        }
        System.out.println("Factorial of "+n+" = "+f);
    }
}
