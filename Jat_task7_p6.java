package myPackage;

import java.util.*;

public class Jat_task7_p6 {
    public static void main(String[] args) {
        // Creating a TreeMap with employee ID as key and name as value
        TreeMap<Integer, String> employees = new TreeMap<>();

        // Adding employee details
        employees.put(103, "Manju");
        employees.put(101, "Alia");
        employees.put(104, "Ranbir");
        employees.put(102, "Salman");

        // Extracting values (names) into a List
        List<String> employeeNames = new ArrayList<>(employees.values());

        // Sorting the names in alphabetical order
        Collections.sort(employeeNames);

        // Printing employee names in alphabetical order with a touch of fun
        System.out.println("Sorted not by fame, nor by might,");
        System.out.println("But alphabet shows who's first in sight!");

        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
