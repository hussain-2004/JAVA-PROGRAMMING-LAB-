/*java program to print the following pattern.
1 
1 2
1 2 3
1 2 3 4*/

class Pattern1{
    public static void main(String args[]){
        int i,j;
        for(i = 1 ; i < 5 ; i++){
            for(j = 1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}