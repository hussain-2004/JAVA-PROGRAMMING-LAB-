public class ArithmeticExc {
    public static void main(String args[]){
        int arr[]={1,2,3};
        int a=5,b=2;
        try{
            try{
                arr[5]=10;
            }
            catch(ArrayIndexOutOfBoundsException ai){
                System.out.println("Error1 : You are trying to access array element out of the bound.");
            }
            a = b/0;
        }
        catch(ArithmeticException ae){
            System.out.println("Error : You can't divided a number with 0!");
        }
        catch(Exception e){
            System.out.println("Generalized error!!!");
        }
        finally{
            System.out.println("Done!!");
        }
    }
}
