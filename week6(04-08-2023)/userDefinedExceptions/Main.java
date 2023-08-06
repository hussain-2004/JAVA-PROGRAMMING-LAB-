//Java program to demonstrate user defined exception.
import java.util.*;
class own extends Exception{
    own(String msg){
        super(msg);
    }
}
class Main{
    public static void main(String args[]){
        try{
            Scanner s1 = new Scanner(System.in);
            int m = s1.nextInt();
            if(m>100){
                throw new own("Greater than 100");
            }
            System.out.println("Marks = "+m);
        }
        catch(own e){
            System.out.println("Exception Caught!!");
            System.out.println(e.getMessage());
        }

    }
}