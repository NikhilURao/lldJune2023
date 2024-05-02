package tbd;

public class SomethingPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("I am printing something");
    }
}
