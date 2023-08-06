
import java.util.*;
class MinimumElementInAnArray {
    public static void main(String args[]){
        int arr[] = new int[10];
        int n,min,i;
        Scanner s1 = new Scanner(System.in);
        System.out.println("No of elements in array? : ");
        n = s1.nextInt();
        System.out.println("Enter "+n+" Array elements.");
        for(i = 0 ; i < n ; i++){
            arr[i] = s1.nextInt();
        }
        min = arr[0];
        for(i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element = "+min);
    }
}
