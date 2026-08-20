public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hi My Name is Suresh";
        String words[] = str.split("\\s+");
        String result = "";
        for(String word : words ){
            result += new StringBuilder(word).reverse().toString()+" ";
        }
        System.out.println(result);
    }   
}
