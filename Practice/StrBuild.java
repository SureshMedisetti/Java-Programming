public class StrBuild {
    public static void main(String[] args){
        
        StringBuilder str = new StringBuilder("Hello Java!");
        
        str.append(" Programmers");
        System.out.println(str);

        str.replace(6,11,"Java");
        System.out.println(str);
    }
}
