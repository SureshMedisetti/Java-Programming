public class ArmStrong {
    public static void main(String[] args) {
        int num = 143;
        int number = num;
        int sumOfCubes = 0;
        while (num != 0){
            int digit = num % 10 ;
            sumOfCubes += digit * digit * digit;
            num = num/10;
        }
        if(sumOfCubes == number){
            System.out.println("Given number is a ArmStrong Number");
        }else{
            System.out.println("Given number is not a ArmStrong Number");
        }
    }
}
