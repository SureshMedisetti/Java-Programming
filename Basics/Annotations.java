@interface Owner{
    String name();
}


class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void sound(){
        System.out.println("Animal Makes sound");
    }
}

@Owner(name = "Suresh")
class Dog extends Animal{
    Dog(String name) {
        super(name);
    }

    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class Annotations {
    public static void main(String[] args) {
        Dog dog = new Dog("Chintu");
        dog.sound();
    }
}
