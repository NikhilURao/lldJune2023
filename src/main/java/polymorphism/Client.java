package polymorphism;

import java.util.Random;

public class Client {

    public static A getSomething() {
        Random random = new Random();
        int a = random.nextInt();

        if (a % 2 == 0) {
            return new B();
        } else {
            return new C();
        }
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(b.age);

        C c = new C();

        A a1 = new B();
        System.out.println(a1.age);
        System.out.println(a1.name);
        // System.out.println(a1.universityName); CE

        //B b1 = new A();
        // access all properties of parent
        // access all properties of cur-> subclass
        B b2 = new B();

        // 1. A parent class object can reference a child object but not the other way round.
        // 2. Although a parent class can reference a child class object, it can not access the child class's attributes and behaviours

        A a2 = new C();



    }

}
