package multithreadingAndConcurrency.helloWorldPrinter;

public class HelloWorldPrinter implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Hello World Thread:" + Thread.currentThread().getName());
        doSomething();
    }

    public void doSomething() {
        System.out.println("Do Something Thread:" + Thread.currentThread().getName());
    }
}
