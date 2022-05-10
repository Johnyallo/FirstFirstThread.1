package MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("group");
        new MyThread(group, "thread1").start();
        new MyThread(group, "thread2").start();
        new MyThread(group, "thread3").start();
        new MyThread(group, "thread4").start();
        Thread.sleep(15000);
        group.interrupt();
    }
}
