import java.util.*;
class ArmstrongNumber{
    public static void main(String args[]){
        int n,n2,sum = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = s1.nextInt();
        n2 = n;
        while(n>0){
            sum += Math.pow(n%10,3);
            n /= 10;
        }
        if(sum == n2){
            System.out.println(n2+" is armstrong number.");
        }
        else{
            System.out.println(n2+"is not a armstrong number.");
        }
    }
}