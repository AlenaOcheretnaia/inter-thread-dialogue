import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");

        final Thread thread1 = new Thread(myThreadGroup, new MyThread("Thread 1"));
        thread1.start();
        final Thread thread2 = new Thread(myThreadGroup, new MyThread("Thread 2"));
        thread2.start();
        final Thread thread3 = new Thread(myThreadGroup, new MyThread("Thread 3"));
        thread3.start();
        final Thread thread4 = new Thread(myThreadGroup, new MyThread("Thread 4"));
        thread4.start();

        try {
            sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.currentThread().getThreadGroup().interrupt();

    }

}
