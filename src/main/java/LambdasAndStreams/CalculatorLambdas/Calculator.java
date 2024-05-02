package LambdasAndStreams.CalculatorLambdas;

import java.util.concurrent.Callable;

@FunctionalInterface
public interface Calculator {
    public int operate(int x, int y);
}
