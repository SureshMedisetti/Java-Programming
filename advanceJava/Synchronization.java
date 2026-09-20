package advanceJava;

class Counter{
    int counter;
    //only on thread can use this method at a time
    public synchronized void increment(){
        counter++;
    }
}
public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter count = new Counter();
        Runnable t1 = () -> {
            for (int i = 0; i < 10; i++) {
                count.increment();
            }
        };
        Runnable t2 = () -> {
            for (int i = 0; i < 10; i++) {
                count.increment();
            }
        };

        Thread one = new Thread(t1);
        Thread two = new Thread(t2);

        one.start();
        two.start();

        //thread waits for another to complete its execution so that it can start its execution
        one.join();
        two.join();

        System.out.println(count.counter);
    }
}
