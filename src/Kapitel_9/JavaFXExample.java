/*
package Kapitel_9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Erstellen eines Fensters
        primaryStage.setTitle("JavaFX Beispiel");

        // Erstellen eines Buttons
        Button btn = new Button();
        btn.setText("Klick mich");

        // Reaktion auf Benutzer-Ereignisse
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button geklickt");
            }
        });

        // Erstellen eines Layouts
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.setAlignment(Pos.CENTER);

        // Erstellen einer Scene
        Scene scene = new Scene(root, 300, 250);

        // Scene hinzufügen
        primaryStage.setScene(scene);

        // Anzeigen des Fensters
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/
