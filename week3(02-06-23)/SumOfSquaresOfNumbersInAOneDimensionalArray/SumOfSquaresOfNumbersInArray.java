import java.util.*;
class SumOfSquaresOfNumbersInArray {
    public static void main(String args[]){
        int arr[] = new int[10];
        int n,sum = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("NO of elements? : ");
        n = s1.nextInt();
        System.out.println("Enter "+n+" Array elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = s1.nextInt();
        }
        //calculating the sum of squares of each element.
        for(int i = 0 ; i < n ; i++){
            sum += Math.pow(arr[i],2);
        }
        System.out.println("Sum of squares of array elements is : "+sum);
    }
}
