public class LongWord {
    public static void main(String[] args) {
        String str = " Hello This Is Suresh";
        String result = "";
        String[] words = str.split("\\s+");
        for (String word : words){
            if(word.length()>result.length()){
                result = word;
            }
        }
        System.out.println(result);
    }
}
