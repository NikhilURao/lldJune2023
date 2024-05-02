package multithreadingAndConcurrency.adderSubtractorAtomicInteger;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Count> {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    public Count call() {
        for (int i = 1; i <= 1000; ++i) {
            count.value.addAndGet(-i);
        }
        return count;
    }
}
