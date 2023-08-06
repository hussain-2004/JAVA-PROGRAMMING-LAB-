//java program to demonstrate nested try block.
class Main{
    public static void main(String args[]){
        try{
            int a = 2;
            int arr[]={1,2,3};
            try{
                arr[42]=99;
            }
            catch(ArrayIndexOutOfBoundsException ai){
                System.out.println("Error in inner try block: ArrayIndexOutOfBound.");
            }
            int b = a/(a-a);

        }
        catch(ArithmeticException ae){
            System.out.println("Error in outer try block : Divide by zero error!!");
        }
    }
}