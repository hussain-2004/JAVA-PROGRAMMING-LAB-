//localhost:hussain
class TypeCasting{
    public static void main(String args[]){
        //implicit type casting.
        int c = 100000;
        float e = c;
        double f = e;
        //implicit type casting.
        System.out.println("Implicit Type casting : ");
        System.out.println("c = "+c);
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        //explicit type casting.
        double d = 6.623825555158445454;
        float f2 = (float)d;
        int i = (int)f;
        System.out.println("Explicit type casting : ");
        System.out.println("d = "+d);
        System.out.println("f = "+f2);
        System.out.println("i = "+i);


    }
}


