public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Hi My Name Is Suresh";
        char check = ' ';
        String str1 = "";
        boolean found = false;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == check ){
                found = true;
            }else{
                str1 += str.charAt(i);
            }
        }
        if(!found){
            System.out.println("Spaces Not Found");
        }
        System.out.println(str1);
    }
}
