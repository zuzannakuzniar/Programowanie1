package Wątki;

public class MyRunnable implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "T1_");
        thread1.start();
        Thread thread2 = new Thread(new MyRunnable(), "T2_");
        thread2.start();
        Thread thread3 = new Thread(new MyRunnable(), "T3_");
        thread3.start();

    }
}
