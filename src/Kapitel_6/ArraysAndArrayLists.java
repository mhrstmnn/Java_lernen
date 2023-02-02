package Kapitel_6;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class ArraysAndArrayLists {
    static void employeeExample() {
        HashMap<String, Employee> employees = new HashMap<>();
        employees.put("John", new Employee("John Doe", 5000));
        employees.put("Jane", new Employee("Jane Doe", 6000));
        employees.put("Jim", new Employee("Jim Smith", 7000));

        System.out.println(employees.get("John"));
        System.out.println(employees.get("Jane"));
        System.out.println(employees.get("Jim"));
    }

    public static void main(String[] args) {
        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(numbers));

        // ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("ArrayList: " + numberList);

        employeeExample();
    }
}

