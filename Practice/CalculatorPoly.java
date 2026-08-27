class Calculator{
    int add (int a,int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}

public class CalculatorPoly {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(7, 8);
        double r2 = obj.add(7.1, 8.6);
        int r3 = obj.add(7, 8,2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
