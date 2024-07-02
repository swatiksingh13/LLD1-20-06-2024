package in.scaler.lld1200624.lld1class7.executors;

import org.springframework.scheduling.config.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);// here we decide no. of threads in 1 pool in 1 executorService

        for (int i = 1; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

    }
}
