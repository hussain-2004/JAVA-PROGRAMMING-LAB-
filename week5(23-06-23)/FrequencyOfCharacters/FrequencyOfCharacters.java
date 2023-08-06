import java.util.*;
class FrequencyOfCharacters {
    public static void main(String args[]){
        String str;
        char ch;
        int count = 0,i;
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str = s1.nextLine();
        System.out.println("Enter a character : ");
        ch = s2.next().charAt(0);
        for(i=0;i<(str.length());i++){
            if(ch == str.charAt(i)){
                count++;
            }
        }
        System.out.println("The Frequency of "+ch+" = "+count);
    }
}
