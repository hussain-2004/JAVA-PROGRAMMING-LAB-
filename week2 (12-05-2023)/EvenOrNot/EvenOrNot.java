import java.util.*;
class EvenOrNot {
    public static void main(String args[]){
        int n;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = s1.nextInt();
        if(n%2 != 0){
            System.out.println(n+" is odd!");
        }
        else{
            System.out.println(n+" is even!");
        }
    }


}
