public class PalindromeString {
   public static void main(String[] args) {
        String text = "Hellolleh";
        String str = text.toLowerCase();
        String rev = "";
        for(char ch : str.toCharArray()){
            rev = ch + rev;
        }
        if(str.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not a Palindrome");
        }
   } 
}
