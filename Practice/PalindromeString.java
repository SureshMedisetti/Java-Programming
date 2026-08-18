public class PalindromeString {
   public static void main(String[] args) {
        String text = "Hellolleh";
        String str = text.toLowerCase();
        String rev = "";
        for(int i = str.length()-1;i>=0;i++){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not a Palindrome");
        }
   } 
}
