package Day2.Wątki;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i =1; i<101; i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
                //Thread.slepp();
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


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
