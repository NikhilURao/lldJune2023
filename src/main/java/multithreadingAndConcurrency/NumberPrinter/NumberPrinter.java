package multithreadingAndConcurrency.NumberPrinter;

public class NumberPrinter implements Runnable{
    private int number;

    NumberPrinter(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println(this.number + " Thread: " + Thread.currentThread().getName());
    }
}
