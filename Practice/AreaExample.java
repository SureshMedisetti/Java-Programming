class Shape{
    public String type;
    Shape(String type){
        this.type = type;
    }
}
public class AreaExample {
    public static void main(String[] args){
        Shape shapes[] = new Shape[4];
        shapes[0] = new Shape("Circle"); 
        shapes[1] = new Shape("Square"); 
        shapes[2] = new Shape("Rectangle");
        shapes[3] = new Shape("Triangle");

        Shape shapesInput[] = new Shape[3];
        shapesInput[0] = new Shape("Diagonal");
        shapesInput[1] = new Shape("Triangle");
        shapesInput[2] = new Shape("Pentagon");
        
        for(Shape shape : shapesInput){
            switch(shape.type){
                case "Circle":
                    System.out.println("Area Of Circle = PI * Radius * Radius ");
                    break;
                case "Square":
                    System.out.println("Area Of Square = Side * Side ");
                    break;
                case "Rectangle":
                    System.out.println("Area of Rectangle = Length * Breadth ");
                    break;
                case "Triangle":
                    System.out.println("Area of Triangle = Half * Length * Breadth ");
                    break;
                default:
                    System.out.println("Invalid Type...");
            }
        }
    } 
}
