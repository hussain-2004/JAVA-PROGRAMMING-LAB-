//Java program to demonstrate throws keyword.
class Test{
    public Test() throws ArithmeticException{
        System.out.println("Error Caught!!");
        throw new ArithmeticException("!!ArithmeticException!!");
    }
}

class Main{
    public static void main(String args[]){
        try{
            Test obj = new Test();
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}