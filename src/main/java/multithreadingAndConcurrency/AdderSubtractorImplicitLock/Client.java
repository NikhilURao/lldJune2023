package multithreadingAndConcurrency.AdderSubtractorImplicitLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Count> fc =executorService.submit(adder);
        Future<Count> fc1 = executorService.submit(subtractor);

        fc.get();
        fc1.get();

        System.out.println(count.value);

    }
}
