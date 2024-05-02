package tbd.MathematicalOperatorLambda;

public class Client {
    public static void main(String[] args) {
        MathematicalOperator adder = (i1, i2) -> i1 + i2;

        System.out.println(adder.operate(2,3));
    }
}
