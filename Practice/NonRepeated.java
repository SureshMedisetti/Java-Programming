public class NonRepeated {
    public static void main(String[] args) {
        String str = "Hello World";
        for(int i =0;i<str.length();i++){
            boolean check = false;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}

