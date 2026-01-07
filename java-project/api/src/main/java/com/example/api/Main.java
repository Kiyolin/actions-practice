package com.example.api;

import com.example.app.CalculatorService;

public class Main {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        int result = service.add(7, 3);
        System.out.println("7 + 3 = " + result);
    }
}
