class Unicode {
    public static void main(String args[]){
        String s = "JAVA";
        int i;
        System.out.println("Unicode values are : ");
        for(i=0;i<(s.length());i++){
            System.out.print(s.charAt(i)+"  ");
            System.out.println((int)(s.charAt(i)));
        }
    }
}
