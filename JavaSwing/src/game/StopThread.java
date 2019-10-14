package game;

public class StopThread extends Thread{

    @Override
    public void run() {
        while(!Thread.interrupted()) {
            System.out.println("Thread is running...");
        }
        System.out.println("Thread stopped....");
    }
}
