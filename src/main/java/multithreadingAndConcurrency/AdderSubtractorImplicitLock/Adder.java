package multithreadingAndConcurrency.AdderSubtractorImplicitLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Count> {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    public Count call() {
        for (int i = 1; i <= 10000; ++i) {
//            synchronised block
//            synchronized (count) {
//                System.out.println("Adder adding value " + i);
//                count.value = count.value + i;
//            }
            count.add(i);
        }

        return count;
    }
}
