package Beispiele.Kapitel_8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIoExample {
    public static void main(String[] args) {
        // Lesen und Schreiben von Textdateien
        String filename = "names.txt";
        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Moritz");
        names.add("Monika");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Schreiben der Datei");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei");
        }

        // Serialisierung und Deserialisierung
        filename = "persons.bin";
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Max", 30));
        persons.add(new Person("Moritz", 35));
        persons.add(new Person("Monika", 25));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(persons);
        } catch (IOException e) {
            System.err.println("Fehler beim Schreiben der Datei");
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Person> deserializedPersons = (List<Person>) ois.readObject();
            for (Person person : deserializedPersons) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Fehler beim Lesen der Datei");
        }
    }
}
