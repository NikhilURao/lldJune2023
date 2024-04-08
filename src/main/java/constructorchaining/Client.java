package constructorchaining;

public class Client {

    public static void main(String[] args) {
        D d = new D();

        // constructor of D will be called

        // A a = new D();

        // D d1 = (D) new A();
    }

    // A -> B -> C -> D
    // A -> B
}
