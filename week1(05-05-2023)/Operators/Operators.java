class Operators {
    public static void main(String args[]){
        int a = 5 ;
        int b = 8 ;
        boolean x = true;
        boolean y = false;
        System.out.println("a = "+a+"\n"+"b = "+b);
        //relational operators.
        System.out.println("is a > b ?: "+(a>b));
        System.out.println("is a < b ?: "+(a<b));
        System.out.println("is a == b ?: "+(a==b));
        //logical operators.
        System.out.println("x = "+x+"\n"+"y = "+y);
        System.out.println("x and y = "+(x&&y));
        System.out.println("x or y = "+(x||y));
        System.out.println("not x = "+(!x));
        //bitwise operators.
        System.out.println("a & b = "+(a&b));
        System.out.println("a | b = "+(a|b));
        System.out.println("a xor b = "+(a^b));
        //inc and dec operators.
        System.out.println("a++ = "+(a++));
        System.out.println("a-- = "+(a--));
        System.out.println("++a = "+(++a));
        System.out.println("--a = "+(--a));
        //assignment operators.
        a=b;
        a += 1;
        b -= 1;
        System.out.println("a = "+a+"\n"+"b = "+b);
    }
}
