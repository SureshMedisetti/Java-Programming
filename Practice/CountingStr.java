public class CountingStr {
    public static void main(String[] args) {
        String str = "hello123 @ # world";

        int symbols = 0;
        int digits = 0;
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        for(char ch : str.toCharArray()){
            if(ch == ' '){
                spaces++;
            }else if(ch >= '0' && ch <= '9'){
                digits++;
            }else if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }else{
                symbols++;
            }
        }
        System.out.println("spaces = "+spaces);
        System.out.println("digits = "+digits);
        System.out.println("vowels = "+vowels);
        System.out.println("consonants = "+consonants);
        System.out.println("symbols = "+symbols);
    }    
}
