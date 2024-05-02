package multithreadingAndConcurrency.producerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(10);
        //Lock lock = new ReentrantLock();
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);

        Consumer consumer = new Consumer(store, producerSemaphore, consumerSemaphore);



        ExecutorService es = Executors.newCachedThreadPool();

        for (int i=1; i< 5; i++){
            es.execute(producer);
        }

        for (int i=1; i< 25; i++){
            es.execute(consumer);
        }
    }

}
