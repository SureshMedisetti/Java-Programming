package advanceJava;

//custom exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class AgeCheck{
    //throws keyword
    public void ageCheck(int age) throws InvalidAgeException{
        if(age<18){
            //throw keyword
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        AgeCheck ageChecker = new AgeCheck();
        try{
            ageChecker.ageCheck(16);
        }catch(InvalidAgeException e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
