import java.util.*;
class DiagonalElementsSum{
    public static void main(String args[]){
        int a[][] = new int[3][3];
        int i,j,sum=0;
        System.out.println("Enter 9 matrix elements of a : ");
        Scanner s1 = new Scanner(System.in);
        for(i = 0 ; i < 3 ; i++){
            for(j = 0 ; j < 3 ; j++){
                a[i][j] = s1.nextInt();
            }
        }
        for(i = 0 ; i < 3 ; i++){
            sum += a[i][i];
        }
        System.out.println("Diagonal elemtns sum = "+sum);
    }
}