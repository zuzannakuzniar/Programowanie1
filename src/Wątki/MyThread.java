package Wątki;

public class MyThread extends Thread{

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("T1_");
        myThread.start();
    }
}
