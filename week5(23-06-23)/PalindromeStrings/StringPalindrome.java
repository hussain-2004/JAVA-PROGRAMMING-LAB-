class StringPalindrome {
    public static void main(String args[]){
        String str = "SOS",rev="";
        for(int i = (str.length()-1) ; i >=0  ; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)==true){
            System.out.println("Given String "+str+" is Palindrome");
        }
        else{
            System.out.println("Given String "+str+" is not Palindrome");
        }
    }
}
