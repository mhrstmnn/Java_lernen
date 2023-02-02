package Kapitel_3;

public class ConditionalsAndLoops {
    public static void main(String[] args) {
        int score = 75;

        // if-else-Struktur
        if (score >= 60) {
            System.out.println("Bestanden");
        } else {
            System.out.println("Nicht bestanden");
        }

        // switch-case-Struktur
        switch (score / 10) {
            case 6:
                System.out.println("Note: D");
                break;
            case 7:
                System.out.println("Note: C");
                break;
            case 8:
                System.out.println("Note: B");
                break;
            case 9:
            case 10:
                System.out.println("Note: A");
                break;
            default:
                System.out.println("Ungültige Note");
        }

        // for-Schleife
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while-Schleife
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
