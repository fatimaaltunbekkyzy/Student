import java.time.LocalDate;
import java.util.Scanner;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Gender gender;
    private StudyFormat studyFormat;


    public Student(long id, String firstName, String lastName, LocalDate dateOfBirth, Gender gender, StudyFormat studyFormat) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.studyFormat = studyFormat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;

    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public StudyFormat getStudyFormat() {
        return studyFormat;
    }

    public void setStudyFormat(StudyFormat studyFormat) {
        this.studyFormat = studyFormat;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Id: " + id +
                "FirstName: " + firstName + "\n" +
                "LastName: " + lastName + "\n" +
                "DateOfBirth: " + dateOfBirth +
                "Gender: " + gender +
                "StudyFormat: " + studyFormat +
                '}';
    }
}


