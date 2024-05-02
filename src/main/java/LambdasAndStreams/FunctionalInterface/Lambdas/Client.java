package LambdasAndStreams.FunctionalInterface.Lambdas;

public class Client {
    public static void main(String[] args) {
        SomethingPrinter sp = new SomethingPrinter();
        Thread t = new Thread(sp);
        t.start();
        // way 1
        Runnable r = () -> {
            System.out.println("Printing Something Lambdas");
        };
        Thread t1 = new Thread(r);
        t1.start();
        // way 2
        Thread t2 = new Thread(() -> System.out.println("Printing Something Lambdas"));
        t2.start();
    }
}
