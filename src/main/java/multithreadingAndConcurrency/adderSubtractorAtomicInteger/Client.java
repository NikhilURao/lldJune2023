package multithreadingAndConcurrency.adderSubtractorAtomicInteger;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
