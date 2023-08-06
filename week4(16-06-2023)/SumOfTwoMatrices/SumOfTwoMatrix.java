import java.util.*;
class SumOfTwoMatrix{
    public static void main(String args[]){
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i,j;
        //accepting first array elements.
        System.out.println("Enter 9 matrix elements of a : ");
        Scanner s1 = new Scanner(System.in);
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                a[i][j] = s1.nextInt();
            }
        }
        //accepting second array elements.
        System.out.println("Enter 9 matrix elements of b : ");
        Scanner s2 = new Scanner(System.in);
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                b[i][j] = s2.nextInt();
            }
        }
        //adding a and b arrays and storing in c.
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        //displaying the result c.
        System.out.println("The sum of two given matrices is : ");
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}