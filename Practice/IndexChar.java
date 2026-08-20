public class IndexChar {
    public static void main(String[] args) {
        String str = "Hi My Name Is Suresh";
        char check = 'x';
        boolean found = false;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == check ){
                System.out.println("Index = " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    }
}
