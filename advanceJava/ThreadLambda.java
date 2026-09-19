package advanceJava;

public class ThreadLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(
            () -> {
                System.out.println("Currently Thread is running ");
            }
        );
        t1.start();
    }
}
