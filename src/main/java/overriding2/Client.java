package overriding2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("");

        B b = new B();

        b.doSomething("");

        A a1 = new B();
        // B x = new A();
        a1.doSomething("");

        C c = new C();

        List<A> ls = new ArrayList<>();
        ls.add(a);ls.add(a1);ls.add(b);ls.add(c);

        for (int i=0; i< ls.size(); i++){
            ls.get(i).doSomething("");
        }

        // parent, childB, childB, childC
    }
}
