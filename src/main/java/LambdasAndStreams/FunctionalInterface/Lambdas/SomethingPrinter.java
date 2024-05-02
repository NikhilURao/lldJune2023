package LambdasAndStreams.FunctionalInterface.Lambdas;

public class SomethingPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing Something");
    }
}
