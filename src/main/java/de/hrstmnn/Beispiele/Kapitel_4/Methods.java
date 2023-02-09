package de.hrstmnn.Beispiele.Kapitel_4;

public class Methods {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int result = add(num1, num2);
        System.out.println("Ergebnis: " + result);

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = getSum(numbers);
        System.out.println("Summe: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
