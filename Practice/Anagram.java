import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silents";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println("Strings are Anagrams");
        }else{
            System.out.println("Strings are Not Anagrams");
        }
    }
    
}