package multithreadingAndConcurrency.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSema;

    private Semaphore consumerSema;
    Producer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        while (true) {
//            synchronized (store){
//                if (store.getDisplaySize() < store.getMaxSize()) {
//                    System.out.println("Adding new item to display");
//                    store.addItem(new Object());
//                }
//            }
            try {
                Thread.sleep(10);
                producerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem(); // CS
            consumerSema.release();

        }
    }
}
