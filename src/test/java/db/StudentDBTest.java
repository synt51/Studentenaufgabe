package db;

import model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class StudentDBTest {

    private StudentDB getTestDB() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Müller", "Andreas", 1, "male", 25));
        students.add(new Student("Koch", "Sabine", 2, "diverse", 30));
        StudentDB studentDB = new StudentDB(students);
        return studentDB;
    }

    @Test
    void checkToString() {
        StudentDB studentDB = getTestDB();
        String checkString = "StudentDB{students=[Student{Nachname= 'Müller', Vorname= 'Andreas', ID= 1, Geschlecht= 'male', Alter= 25}, Student{Nachname= 'Koch', Vorname= 'Sabine', ID= 2, Geschlecht= 'diverse', Alter= 30}]}";
        assertEquals(checkString, studentDB.toString());
    }

    @Test
    void checkToStringFalse() {
        StudentDB studentDB = getTestDB();
        String checkString = "";
        assertNotEquals(checkString, studentDB.toString());
    }

    @Test
    void checkAddingStudent() {
        StudentDB studentDB = getTestDB();
        studentDB.addStudent(new Student("Schmitz", "Petra", 3, "female", 18));
        assertEquals(3, studentDB.allStudents().size());
    }

    @Test
    void checkAddingStudentFalse() {
        StudentDB studentDB = getTestDB();
        studentDB.addStudent(new Student("Schmitz", "Petra", 3, "female", 18));
        assertNotEquals(4, studentDB.allStudents().size());
    }

    @Test
    void checkAllStudentsListSize() {
        StudentDB studentDB = getTestDB();
        assertEquals(2, studentDB.allStudents().size());
    }

    @Test
    void checkAllStudentsListSizeFalse() {
        StudentDB studentDB = getTestDB();
        assertNotEquals(3, studentDB.allStudents().size());
    }

    @Test
    void checkRemovingStudentID() {
        StudentDB studentDB = getTestDB();
        studentDB.removeStudentID(1);
        assertEquals(1, studentDB.allStudents().size());
    }

    @Test
    void checkRemovingStudentIDFalse() {
        StudentDB studentDB = getTestDB();
        studentDB.removeStudentID(1);
        assertNotEquals(2, studentDB.allStudents().size());
    }
}