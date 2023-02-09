package de.hrstmnn.Aufgaben.Uebung_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2.5, calculator.add(1, 1.5));
    }

}
