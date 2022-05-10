package MyThread;

public class MyThread extends Thread{
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(1500);
                System.out.println("I am " + getName() + ". Hello!");
            }
        } catch (InterruptedException e) {
        } finally {
            System.out.printf("%s process is complited ", getName() + ".");
        }
    }
}
