import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Main метод
        System.out.println(StudentService.createStudent(1L, "John", "Doe", LocalDate.of(2000, 1, 1), Gender.MALE, StudyFormat.ONLINE));
        System.out.println(StudentService.createStudent(2L, "Jane", "Doe", LocalDate.of(2001, 6, 20), Gender.FEMALE, StudyFormat.OFFLINE));

        // Аты менен чыгарып издоо учун
        Student student = StudentService.getStudentByFirstName("John");
        if (student != null) {
            System.out.println("Found student: " + student);
        }

        // Бардык студенттерди алуу учун
        Student[] allStudents = StudentService.getAllStudents();
        System.out.println("All students:");
        for (Student s : allStudents) {
            if (s != null) {
                System.out.println(s);
            }
        }

        // Студунтти жаныртуу
        System.out.println(StudentService.updateStudent(1L, new Student(1L, "John", "Doe", LocalDate.of(2000, 1, 1), Gender.MALE, StudyFormat.OFFLINE)));

        // Студентти очуруп салуу
        StudentService.deleteStudentById(2L);
        System.out.println("After deletion:");

    }}



