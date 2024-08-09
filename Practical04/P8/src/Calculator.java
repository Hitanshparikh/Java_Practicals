package com.example.util;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

package com.example.main;

import com.example.util.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(5, 3);
        int difference = calc.subtract(10, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}