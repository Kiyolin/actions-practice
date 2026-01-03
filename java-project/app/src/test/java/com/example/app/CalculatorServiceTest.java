package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    @Test
    void testAdd() {
        CalculatorService service = new CalculatorService();
        assertEquals(10, service.add(7, 3));
    }

}
