package multithreadingAndConcurrency.producerConsumer;

import java.util.concurrent.Callable;

public class Producer implements Runnable {
    private Store store;

    Producer(Store store) {
        this.store = store;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        while (true) {
            synchronized (store){
                if (store.getDisplaySize() < store.getMaxSize()) {
                    System.out.println("Adding new item to display");
                    store.addItem(new Object());
                }
            }
        }
    }
}
