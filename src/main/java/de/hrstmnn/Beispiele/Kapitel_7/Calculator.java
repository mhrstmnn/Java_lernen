package Beispiele.Kapitel_7;

public class Calculator {
    public int divide(int numerator, int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Teilen durch Null ist nicht erlaubt");
        }
        return numerator / denominator;
    }
}
