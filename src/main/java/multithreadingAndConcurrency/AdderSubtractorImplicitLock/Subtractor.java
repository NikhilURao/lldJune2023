package multithreadingAndConcurrency.AdderSubtractorImplicitLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Count> {
    private Count count;

    public Subtractor(Count count) {

        this.count = count;
    }

    public Count call() {

        for (int i = 1; i <= 10000; ++i) {
//            synchronized (count) {
//                System.out.println("Subtractor subtracting value "+i);
//                count.value = count.value - i;
//            }
            count.sub(i);

        }

        return count;
    }
}
