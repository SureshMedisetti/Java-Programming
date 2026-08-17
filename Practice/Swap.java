public class Swap {
    public static void main(String[] args){
    int num1 = 5;
    int num2 = 9;

        System.out.println("Numbers before Swapping : " + num1 + " " + num2);
        
        int temp = num1;
        num1 = num2 ;
        num2 = temp;
        
        System.out.println("Numbers After Swapping : " + num1 + " " + num2);
        
    }
}
