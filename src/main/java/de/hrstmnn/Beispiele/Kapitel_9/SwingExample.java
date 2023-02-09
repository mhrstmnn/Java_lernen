package Beispiele.Kapitel_9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    private static void createAndShowGUI() {
        // Erstelle ein Fenster
        JFrame frame = new JFrame("Swing Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Erstelle einen Button
        JButton button = new JButton("Klick mich");

        // Reagiere auf Benutzer-Ereignisse
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button geklickt");
            }
        });

        // Füge den Button zum Fenster hinzu
        frame.getContentPane().add(button);

        // Zeige das Fenster
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
