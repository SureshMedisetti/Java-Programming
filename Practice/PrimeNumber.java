public class PrimeNumber {
    public static void main(String[] args) {
        int num = 6;
        if (num <= 1){
            System.out.println("Not A Prime Number");
        }else{
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Given Number is a Prime Number");
            }else{
                System.out.println("Not A Prime Number");
            }
        }
    }
}
