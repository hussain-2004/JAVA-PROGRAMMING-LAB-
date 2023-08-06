//Linear Search program in java
//local host hussain.
import java.util.*;
class LinearSearch{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int n,f=0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Search Element : ");
        n = s1.nextInt();
        for(int i = 0 ; i < 12 ; i++){
            if(arr[i] == n){
                System.out.println(n+" found at location "+(i+1));
                f=1;
                break;
            }
        }
        if(f == 0){
            System.out.println(n+" not found in the array.");
        }

    }
}