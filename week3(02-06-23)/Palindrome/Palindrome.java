import java.util.*;
class Palindrome{
    public static void main(String args[]){
        int n,rev=0,n2;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = s1.nextInt();
        n2 = n;
        while(n>0){
            rev = (rev*10)+(n%10);
            n = n/10;
        }
        if(rev == n2){
            System.out.println(n2+" is a palindrome number.");
        }
        else{
            System.out.println(n2+" is not a palindrome number.");
        }
    }
}