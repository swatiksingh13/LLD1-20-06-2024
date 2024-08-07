package in.scaler.lld1200624.lld1class7.addersubtractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Synchronization problem");
        System.out.println(count.value);
    }
}

// if we do this above code
// answer will also be 0
// as it is not synchronous it is sequential

// t1.start();
// t1.join();
// t2.start();
//t2.join();