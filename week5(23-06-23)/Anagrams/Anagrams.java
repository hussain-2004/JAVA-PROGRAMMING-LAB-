import java.util.*;
class Anagrams {
    public static void main(String args[]){
        String s1 = "army";
        String s2 = "mary";
        boolean res;
        s1.toLowerCase();
        s2.toLowerCase();
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        res = Arrays.equals(c1,c2);
        if(res==true){
            System.out.println(s1+" & "+s2+" Are Anagrams");
        }
        else{
            System.out.println(s1+" & "+s2+" Are Not Anagrams");
        }

    }
}
