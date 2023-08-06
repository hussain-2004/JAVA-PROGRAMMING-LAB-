import java.util.*;
class SortTheElementsInArray {
    public static void main(String args[]){
        int arr[] = new int[10];
        int n,i,j,min,temp;
        Scanner s1 = new Scanner(System.in);
        System.out.println("No of arrays elemets ?: ");
        n = s1.nextInt();
        System.out.println("Enter "+n+" Array Elements : ");
        for(i=0;i<n;i++){
            arr[i] = s1.nextInt();
        }
        //selection sort
        for(i=0;i<n;i++){
            min = i;
            for(j = i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min != i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.print("Sorted array = ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
