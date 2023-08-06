//Program to demonstrate throw keyword
import java.util.*;
class Main{
    public static void main(String args[]){
        try{
            throw new ArithmeticException("Exception Thrown Successfully!!");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());        
        }
    }
}