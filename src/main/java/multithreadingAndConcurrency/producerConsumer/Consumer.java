package multithreadingAndConcurrency.producerConsumer;

public class Consumer implements Runnable{
    private Store store;

    Consumer(Store store) {
        this.store = store;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        while (true) {
            synchronized (store){
                if (store.getDisplaySize() > 0) { // 1
                    System.out.println("Removing an item from display display");
                    store.removeItem();
                }
            }
        }
    }

}
