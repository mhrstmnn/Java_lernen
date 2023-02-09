package de.hrstmnn.Beispiele.Kapitel_10;

import java.sql.*;

public class DatabaseExample {
    public static void main(String[] args) {
        try {
            // Datenbanktreiber laden
            Class.forName("com.mysql.jdbc.Driver");

            // Verbindung zur Datenbank herstellen
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "username", "password");

            // Statement erzeugen
            Statement stmt = conn.createStatement();

            // SELECT-Anfrage ausführen
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Ergebnis ausgeben
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age"));
            }

            // Ressourcen freigeben
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
