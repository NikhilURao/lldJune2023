package multithreadingAndConcurrency.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;

    private Semaphore producerSema;

    private Semaphore consumerSema;

    Consumer(Store store, Semaphore producerSema, Semaphore consumerSema) {
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
//                if (store.getDisplaySize() > 0) { // 1
//                    System.out.println("Removing an item from display display");
//                    store.removeItem();
//                }
//            }
            try {
                Thread.sleep(10);
                consumerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            producerSema.release();

        }
    }

}
