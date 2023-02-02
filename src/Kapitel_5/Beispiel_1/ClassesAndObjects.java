package Kapitel_5.Beispiel_1;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println(person);
        person.setName("Jane Doe");
        person.setAge(31);
        System.out.println(person);
    }
}
