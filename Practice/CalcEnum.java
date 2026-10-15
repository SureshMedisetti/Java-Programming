import java.util.Scanner;

enum Calculator{
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION
}
public class CalcEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().trim().toUpperCase();

        try{
            Calculator calc = Calculator.valueOf(str);
            switch(calc){
                case ADDITION:
                    System.out.println("ADDITION = "+(num1+num2));
                    break;
                case SUBTRACTION:
                    System.out.println("SUBTRACTION = "+(num1-num2));
                    break;
                case MULTIPLICATION:
                    System.out.println("MULTIPLICATION = "+(num1*num2));
                    break;
                case DIVISION:
                    System.out.println("DIVISION = "+(num1/num2));
                    break;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid Input");
        }
        finally{
            sc.close();
        }
    }
}
