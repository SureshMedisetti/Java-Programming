public class LengthString {
    public static void main(String[] args) {
        String string = "HelloWorld!";
        int length=0;
        for (char ch : string.toCharArray()){
            length++;
        }
        System.out.println(length);
    }
    
}