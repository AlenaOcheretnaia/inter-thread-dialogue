public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println("Всем привет!" + getName());
                sleep(3000);
            }
        } catch (InterruptedException err) {
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }

}
