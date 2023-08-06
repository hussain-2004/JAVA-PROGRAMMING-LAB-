class DuplicateStringCharacters {
    public static void main(String args[]){
        String s = "AceengineeringCollege";
        int i,j;
        System.out.print("Duplicate Characters : ");
        for(i=0;i<(s.length());i++){
            for(j=0;j<(s.length());j++){
                if(i!=j && (s.charAt(i)==s.charAt(j)) && (s.charAt(i)!='0')){
                    System.out.print(s.charAt(i)+" ,");
                    s=s.replace(s.charAt(i),'0');
                    break;
                }
            }
        }

    }
}
