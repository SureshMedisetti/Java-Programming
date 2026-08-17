package OOPs;

class JavaConstructor{
        JavaConstructor(String name){
        
        System.out.println("Constructor with one "
                           + "argument - String: " + name);
    }

    JavaConstructor(String name, int age){

        System.out.println(
            "Constructor with two arguments: "
            + " String and Integer: " + name + " " + age);
    }

    JavaConstructor(long id)
    {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id);
    }
}

public class ConstructorOverLoading {
    public static void main(String[] args){
        
        JavaConstructor geek2 = new JavaConstructor("Sweta");

        JavaConstructor geek3 = new JavaConstructor("Amiya", 28);

        JavaConstructor geek4 = new JavaConstructor(325614567);
    }
}