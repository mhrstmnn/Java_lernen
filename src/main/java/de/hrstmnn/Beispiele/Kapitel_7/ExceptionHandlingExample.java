package Beispiele.Kapitel_7;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int result = calculator.divide(10, 0);
            System.out.println("Ergebnis: " + result);
        } catch (DivideByZeroException e) {
            System.err.println("Fehler: " + e.getMessage());
        } finally {
            System.out.println("Fertig");
        }
    }
}
