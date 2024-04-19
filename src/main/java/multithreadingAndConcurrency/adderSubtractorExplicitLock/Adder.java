package multithreadingAndConcurrency.adderSubtractorExplicitLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Count> {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    public Count call() {
        for (int i = 1; i <= 100; ++i) {
            lock.lock();
            System.out.println("Adder adding value "+i);
            count.value = count.value + i;
            lock.unlock();
        }
        return count;
    }
}
