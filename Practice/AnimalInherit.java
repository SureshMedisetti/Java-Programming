class Animal{
    public void eat(){
        System.out.println("Eating..");
    }

    public void sleep(){
        System.out.println("Sleeping..");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking..");
    }
}

public class AnimalInherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
