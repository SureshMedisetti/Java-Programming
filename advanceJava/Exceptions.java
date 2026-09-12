package advanceJava;

public class Exceptions {
    public static void main(String[] args) {
        int i =10;
        int j=0;
        int[] arr = {1,2,3,4,5};
        try{
            int result = i/j;
            int r = arr[5];
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by 0!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        }finally{
            System.out.println("Finally block executed");
        }
    }
}
