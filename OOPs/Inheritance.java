package OOPs;

class Vehicle{
    public void display( ){
        System.out.println("This Is A Vehicle");
    }
}

class Car extends Vehicle{
    public void Show(){
        System.out.println("Car Is a Vehicle");
    }
}

class Ferrari extends Vehicle{
    public void print(){
        System.out.println("Ferrari Is A Vehicle");
    }
}

public class Inheritance {
    public static void main(String[] args){
        Ferrari obj = new Ferrari();
        Car obj1 = new Car();
        obj1.display();
        obj1.Show();
        obj.display();
        obj.print();
    }
}
