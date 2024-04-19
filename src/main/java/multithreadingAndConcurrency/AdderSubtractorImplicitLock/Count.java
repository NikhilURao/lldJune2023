package multithreadingAndConcurrency.AdderSubtractorImplicitLock;

public class Count {
    int value = 0;

    synchronized int add(int i) {
        System.out.println("Adder adding "+i);
        return this.value + i;
    }

    synchronized int sub(int i) {
        System.out.println("Subtractor subtracting "+i);
        return this.value - i;
    }
}
