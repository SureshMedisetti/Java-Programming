package advanceJava;

class ThreadOne extends Thread{
    @Override 
    public void run(){
        System.out.println("Thread One is Running "+Thread.currentThread().getName());
    }
}

class ThreadTwo extends Thread{
    @Override 
    public void run(){
        System.out.println("Thread Two is Running "+Thread.currentThread().getName());
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
    }
}
