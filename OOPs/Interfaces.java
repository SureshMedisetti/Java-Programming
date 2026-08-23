package OOPS;

interface Shape{
    double calculateArea(); 
}
class Circle implements Shape{
    
    private double r;
    public Circle(double r){ 
        
      this.r = r; 
    }
    public double calculateArea()
    {
        return Math.PI * r * r;
    }
}
class Rectangle implements Shape{
    
    private double length;
    private double width;

    public Rectangle(double length, double width){
        
        this.length = length;
        this.width = width;
    }
    public double calculateArea() { 
      return length * width; 
    }
}
public class Interfaces {
    public static void main(String[] args) {
        // Reference type is the interface (Shape)
        Shape cir = new Circle(5.0);
        Shape rect = new Rectangle(4.0, 6.0);

        // Dynamic method dispatch — decides which method to call at runtime
        System.out.println("Area of Circle: " + cir.calculateArea());
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
