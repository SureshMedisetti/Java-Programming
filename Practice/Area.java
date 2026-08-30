abstract class Shape{
    public abstract double area();
    public abstract void show();
}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return length * breadth;
    }

    @Override
    public void show(){
        System.out.println("Area of Rectangle = " + area());
    }
}

class Square extends Shape{
    double length;

    Square(double length){
        this.length = length;
    }

    @Override
    public double area(){
        return length*length;
    }

    @Override
    public void show(){
        System.out.println("Area of Square = " + area());
    }
}

class Triangle extends Shape{
    double height;
    double base;

    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double area(){
        return 0.5 * base * height;
    }

    @Override
    public void show(){
        System.out.println("Area of Traingle = "+area());
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public void show(){
        System.out.println("Area of Circle = " + area());
    }
}
public class Area {
    public static void main(String[] args) {
        Shape square = new Square(4);
        square.show();
        Shape rectangle = new Rectangle(6,4);
        rectangle.show();
        Shape circle = new Circle(4);
        circle.show();
        Shape triangle = new Triangle(4,6);
        triangle.show();
    }   
}
