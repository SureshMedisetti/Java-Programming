package OOPS;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }

    //Overloading
    public double add(double a, double b){
        return a+b;
    }
}

class Advance extends Calculator{
    //Overriding
    public int add(int a, int b){
        return a+b+2;
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        int r = obj1.add(7, 6);
        System.out.println("Before Overriding = " + r);
        Calculator obj = new Advance();
        int n = obj.add(7, 6);
        double m = obj.add(3.2, 4.9);
        System.out.println("After Overriding = " + n);
        System.out.println("After Overloading = " + m);
    }
}
