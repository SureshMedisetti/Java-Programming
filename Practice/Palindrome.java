public class Palindrome {
    public void palindrome(int num){
        int rev =0;
        int number = num;
        while (num != 0){
        int digit = num % 10;
        rev = rev*10 + digit;
        num = num/10;
        }
        if(number == rev){
            System.out.println(number + " Is A Palindrome");
        }else{
            System.out.println(number + " Is Not A Palindrome");
        }
        
    }
    public static void main(String[] args) {
        int num1 = 1525251;
        Palindrome obj = new Palindrome();
        obj.palindrome(num1);
        obj.palindrome(123454321);
    }
}
