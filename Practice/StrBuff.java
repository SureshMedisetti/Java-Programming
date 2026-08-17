public class StrBuff {
    public static void main(String[] args){

        StringBuffer Str = new StringBuffer("Hello ");
        System.out.println(Str);

        Str.append("World!");
        System.out.println(Str);
        
        Str.delete(6, 12);
        System.out.println(Str);

        System.out.println(Str.capacity());

        Str.reverse();
        System.out.println(Str);

        System.out.println(Str.length());
    }   
}
