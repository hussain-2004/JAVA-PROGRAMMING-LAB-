import java.util.*;
class SumOfTwo1DArrays{
    public static void main(String args[]){
        int i;
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10};
        int c[] = new int[5];
        //printing sum of two arrays.
        for(i=0;i<5;i++){
            c[i]=a[i]+b[i];
        }
        System.out.println("Sum of arrays : ");
        for(i=0;i<5;i++){
            System.out.print(c[i]+" ");
        }
    }
}