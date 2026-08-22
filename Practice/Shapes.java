class Rectangle{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
}

public class Shapes{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 6);
        System.out.println("Area = "  + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());
    }
}