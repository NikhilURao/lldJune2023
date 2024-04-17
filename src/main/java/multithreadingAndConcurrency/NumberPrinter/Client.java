package multithreadingAndConcurrency.NumberPrinter;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // creating 100 threads
//        for (int i=1; i<=100; i++){
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);
//            t.start();
//        }
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i=1; i<=1000000; i++){
            NumberPrinter np = new NumberPrinter(i);
            es.execute(np);
        }



    }
}
