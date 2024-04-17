package multithreadingAndConcurrency.helloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter printer = new HelloWorldPrinter();
        // p.run(); this doesn't create a new thread, uses the main thread to execute run function
        Thread t = new Thread(printer);
        t.start();
        System.out.println("Main Thread: "+ Thread.currentThread().getName());
    }
}
