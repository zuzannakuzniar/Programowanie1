package Day2.Wątki;

public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i =1; i<101; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("T1_");
        myThread.start();
    }
}

