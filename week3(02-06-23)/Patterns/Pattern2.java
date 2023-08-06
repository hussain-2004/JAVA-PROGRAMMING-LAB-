class Pattern2{
    public static void main(String args[]){
        int i,j,f=1;
        for(i = 1 ; i < 5 ; i++){
            for(j = 1 ; j <= i ; j++){
                System.out.print((f++)+" ");
            }
            System.out.println();
        }
    }
}