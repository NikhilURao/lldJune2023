package LambdasAndStreams.AdderSubtractorLambdas;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Count count = new Count();

        // Adder adder = new Adder(count);
        // Subtractor subtractor = new Subtractor(count);
        Lock lock = new ReentrantLock();

        Callable<Count> adder = () -> {
            for (int i = 1; i <= 1000; ++i) {
                lock.lock();
                count.value = count.value + i;
                lock.unlock();
            }
            return count;
        };

        Callable<Count> subtractor = () -> {
            for (int i = 1; i <= 1000; ++i) {
                lock.lock();
                count.value = count.value - i;
                lock.unlock();
            }
            return count;
        };

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Count> fc =executorService.submit(adder);

        Future<Count> fc1 = executorService.submit(subtractor);

        fc.get();
        fc1.get();

        System.out.println(count.value);

    }
}
