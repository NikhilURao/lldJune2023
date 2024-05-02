package generics;

public class Client {
    public static void main(String[] args) {
        GenericMethods<Integer, String> student = new GenericMethods<>(1, "Nik");
        String name = student.getValue();
        GenericMethods.doSomething("Nik", 1);
        GenericMethods.doSomething(1, "Nik");
    }
}
