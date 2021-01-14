package Chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish):");
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("ID #: ");
                int id = input.nextInt();
                students.put(id, newStudent);
                input.nextLine();
            }
        }
        while (!newStudent.equals(""));
        System.out.print("Students:\n");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID# " + student.getKey() + ": " + student.getValue());
        }
    }
}
