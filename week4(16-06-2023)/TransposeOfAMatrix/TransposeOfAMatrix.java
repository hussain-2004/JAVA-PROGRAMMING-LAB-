import java.util.*;
class TransposeOfAMatrix{
    public static void main(String args[]){
        int a[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i,j;
        //accepting first matrix elements.
        System.out.println("Enter 9 matrix elements of a : ");
        Scanner s1 = new Scanner(System.in);
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                a[i][j] = s1.nextInt();
            }
        }
        //storing transpose in third matrix.
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                c[i][j] = a[j][i];
            }
        }
        //displaying the result c.
        System.out.println("The transpose of given matrices is : ");
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}