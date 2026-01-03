package com.example.app;

import com.example.core.Calculator;

public class CalculatorService {
    private final Calculator calculator;

    public CalculatorService() {
        this.calculator = new Calculator();
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }
}
