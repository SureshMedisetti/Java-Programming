public class Fibbonaci{
    public void Series(int number, int num1, int num2){
        if (number == 0){
            return;
        }
        System.out.print(num1 + " ");
        Series(number-1, num2 , num1 + num2);
    }
    public static void main(String[] args) {
        Fibbonaci obj = new Fibbonaci();
        obj.Series(5, 0, 1);
    }
}