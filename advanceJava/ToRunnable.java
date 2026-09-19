package advanceJava;

class MyTask implements Runnable{
    @Override 
    public void run(){
        System.out.println("Task is Running " + Thread.currentThread().getName());
    }
}

public class ToRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}
