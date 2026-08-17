public class DigitsSum {
    public static void main(String[] args) {
        int num =63782466;
        int sum = 0;
        int digit = 0;
        while (num>0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println(sum);
    }
}
