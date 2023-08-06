import java.util.*;
class Prime{
    public static void main(String args[]){
        int n,c=0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = s1.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>2){
            System.out.println(n+" is not a prime number.");
        }
        else{
            System.out.println(n+" is a prime number.");
        }
    }
}