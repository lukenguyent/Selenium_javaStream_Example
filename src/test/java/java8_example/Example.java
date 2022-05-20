package java8_example;

import org.testng.annotations.Test;

public class Example {

    @FunctionalInterface
    public interface greeting {
        String hello(String name);
    }

    @Test
    public void returnValue() {
        greeting helloMe = s -> s.toUpperCase();

        System.out.println(helloMe.hello("luke"));
    }

    @FunctionalInterface
    private interface mathCalculator{
        int operator(int a, int b);
    }
    @Test
    public void mathCalculator() {
        mathCalculator add = (a,b) -> a + b;
        mathCalculator substract = (a,b) -> a-b;
        mathCalculator multiply = (a,b) -> a*b;
        mathCalculator divide = (a, b) -> a/b;
        int result = result(add);
        System.out.println(result);
    }


    private int result(mathCalculator operant) {
        return operant.operator(2,4);
    }
}
