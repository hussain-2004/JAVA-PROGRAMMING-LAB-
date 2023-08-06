//Java program to demonstrate finally block.

class Main{
    public static void main(String args[]){
        int a = 10,b = 5,c[]={1,2,3};
        try{
            a = a-a;
            b = b/a;
            c[5] = 100;
        }
        catch(ArithmeticException ae){
            System.out.println("This is divide by zero exception: "+ae);
        }
        finally{
            System.out.println("a = "+a+"\n"+"b = "+b);
        }
    }
}