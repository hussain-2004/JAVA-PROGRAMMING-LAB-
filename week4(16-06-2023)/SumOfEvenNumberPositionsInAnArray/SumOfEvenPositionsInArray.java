import java.util.*;
class SumOfEvenPositionsInArray {
    public static void main(String args[]){
        int arr[] = new int[100];
        int n,i,sum = 0;
        System.out.println("No. of elements in array? :");
        Scanner s1 = new Scanner(System.in);
        n = s1.nextInt();
        System.out.println("Enter "+n+" Array elements : ");
        for(i = 0 ; i < n ; i++){
            arr[i] = s1.nextInt();
        }
        for(i = 1 ; i < n ; i=i+2){
            sum += arr[i];
        }
        System.out.println("Sum of even position numbers = "+sum);
        
    }
}
