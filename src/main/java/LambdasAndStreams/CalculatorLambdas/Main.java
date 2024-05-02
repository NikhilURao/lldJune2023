package LambdasAndStreams.CalculatorLambdas;

public class Main {
    public static void main(String[] args) {
        Calculator adder = (x, y) -> x + y;

        System.out.println(adder.operate(2,4));

        Calculator subtractor = (x, y) -> x - y;

        System.out.println(subtractor.operate(4, 4));
    }
}
