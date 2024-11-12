import java.time.LocalDate;
public class StudentService {

    private static Student[] students = new Student[100];  // Студенттерди сактоо үчүн массив
    private static int studentCount = 0;  // Массивдеги окуучулардын саны


    // Create method
    public static String createStudent(Long id, String firstName, String lastName, LocalDate dateOfBirth, Gender gender, StudyFormat studyFormat) {
        try {
            if (studentCount >= students.length) {
                throw new Exception("Database is full, cannot add more students.");
            }
            Student student = new Student(id, firstName, lastName, dateOfBirth, gender, studyFormat);
            students[studentCount++] = student;
            return "Student created successfully.";
        } catch (Exception e) {
            return "Error in creating student: " + e.getMessage();
        }
    }

    // Read method:
    public static Student getStudentByFirstName(String name) {
        try {
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getFirstName().equalsIgnoreCase(name)) {
                    return students[i];
                }
            }
            throw new Exception("Student not found.");
        } catch (Exception e) {
            System.out.println("Error in fetching student: " + e.getMessage());
            return null;
        }
    }

    // Бардык студенттерди алуу учун
    public static Student[] getAllStudents() {
        try {
            if (studentCount == 0) {
                throw new Exception("No students in the database.");
            }
            Student[] allStudents = new Student[studentCount];
            System.arraycopy(students, 0, allStudents, 0, studentCount);
            return allStudents;
        } catch (Exception e) {
            System.out.println("Error in fetching all students: " + e.getMessage());
            return new Student[0];
        }
    }

    // Update method

    public static String updateStudent(Long id, Student updatedStudent) {
        try {
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getId().equals(id)) {
                    students[i] = updatedStudent;
                    return "Student updated successfully.";
                }
            }
            throw new Exception("Student with given ID not found.");
        } catch (Exception e) {
            return "Error in updating student: " + e.getMessage();
        }
    }

    // Delete method
    public static void deleteStudentById(Long id) {
        try {
            boolean found = false;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getId().equals(id)) {
                    students[i] = null; // Remove the student from the array
                    // Shift all the remaining students
                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[--studentCount] = null; // Decrease count and nullify the last element
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new Exception("Student with given ID not found.");
            }
        } catch (Exception e) {
            System.out.println("Error in deleting student: " + e.getMessage());
        }
    }
    }




