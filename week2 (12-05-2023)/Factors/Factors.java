import java.util.*;
class Factors {
    public static void main(String args[]){
    int n,i;
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a number : ");
    n = s1.nextInt();
    System.out.print("Factors of "+n+" are : ");
    for(i=1;i<=n;i++){
        if(n%i==0){
            System.out.print(i+" ");
        }
    }
    }


}
