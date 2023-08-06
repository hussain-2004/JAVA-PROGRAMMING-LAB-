import java.util.*;
public class PerfectNumber {
    public static void main(String args[]){
        int n,sum=0,i;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = s1.nextInt();
        for(i = 1; i<=(n/2) ; i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum == n){
            System.out.println(n+" is perfect number.");
        }
        else{
            System.out.println(n+" is not a perfect number.");
        }
    }
}
