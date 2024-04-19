package multithreadingAndConcurrency.producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(10);
        Lock lock = new ReentrantLock();
        Producer producer = new Producer(store);

        Consumer consumer = new Consumer(store);

        ExecutorService es = Executors.newCachedThreadPool();

        for (int i=1; i< 10; i++){
            es.execute(producer);
        }

        for (int i=1; i< 25; i++){
            es.execute(consumer);
        }
    }

}
