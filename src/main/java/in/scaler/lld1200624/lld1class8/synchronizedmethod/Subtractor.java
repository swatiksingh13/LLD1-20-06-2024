package in.scaler.lld1200624.lld1class8.synchronizedmethod;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("subtractor : " + i + " " + Thread.currentThread().getName());
            count.incrementValue(-i);
        }

    }
}