package multithreadingAndConcurrency.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> ls = List.of(8, 1, 4, 3, 9, 7, 6);
        ExecutorService ex = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(ls, ex);
        Future<List<Integer>> sortedLsFuture = ex.submit(sorter);
        List<Integer> sortedLs = sortedLsFuture.get();

        for (int i=0; i<sortedLs.size(); i++) {
            System.out.println(sortedLs.get(i));
        }
    }
}
