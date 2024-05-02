package tbd;

public class Client {
    public static void main(String[] args) {
//        SomethingPrinter sp = new SomethingPrinter();
//        Thread t = new Thread(sp);
//        t.start();

        // way 1
//        Runnable r = () -> {
//            System.out.println("I am printing something");
//        };
//        Thread t1 = new Thread(r);
//        t1.start();

        // way 2
//        Thread t2 = new Thread(
//                () -> {
//                    System.out.println("I am printing something");
//                }
//        );
//        t2.start();

        // way 3
        Thread t3 = new Thread(() -> System.out.println("I am printing something"));
        t3.start();
    }
}
