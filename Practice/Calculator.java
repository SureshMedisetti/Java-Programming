public class Calculator {
    public double add(int num1, int num2){
        return num1 + num2;
    }
    public double sub(int num1, int num2){
        return num1 - num2;
    }
    public double multi(int num1, int num2){
        return num1 * num2;
    }
    public double div(int num1, int num2){
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(24,32));
        System.out.println(obj.sub(24,22));
        System.out.println(obj.div(24,12));
        System.out.println(obj.multi(24,12));
    }
}
