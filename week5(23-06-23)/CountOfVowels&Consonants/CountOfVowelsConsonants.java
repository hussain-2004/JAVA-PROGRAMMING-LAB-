import java.util.*;
class CountOfVowelsConsonants {
    public static void main(String args[])
    {
    String str;
    Scanner s1 = new Scanner(System.in);
    int i,vowelCount = 0,consonantCount=0;
    System.out.println("Enter a string : ");
    str = s1.nextLine();
    str.toLowerCase();
    for(i=0;i<(str.length());i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            vowelCount++;
        }
        else{
            consonantCount++;
        }
    }
    System.out.println("No. of vowels = "+vowelCount);
    System.out.println("No. of consonants = "+consonantCount);
}
}
