class CharactersAtOddPosition {
    public static void main(String args[]){
        String s = "AnyaAhil";
        int i;
        System.out.println("Characters at odd position = ");
        for(i=0;i<(s.length());i=i+2){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
