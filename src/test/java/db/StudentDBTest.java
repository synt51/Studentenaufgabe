package db;

import model.ComputerScienceStudent;
import model.HistoryStudent;
import model.Student;
import model.StudentAbstract;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class StudentDBTest {
//
//    private StudentDB getTestDB() {
//        Map<Integer, Student> students = new HashMap<>();
//        students.put(1, new ComputerScienceStudent("Müller", "Andreas", "male", 25, "Computer Science", 2.0f,true));
//        students.put(2, new HistoryStudent("Koch", "Sabine", "diverse", 30, "History", 1.7f, false));
//        StudentDB studentDB = new StudentDB(new HashMap<Integer, StudentAbstract>());
//        return studentDB;
//    }
//
//    @Test
//    void checkToString() {
//        StudentDB studentDB = getTestDB();
//        String checkString = "StudentDB{students=[Student{ Nachname='Müller', Vorname='Andreas', Geschlecht='male', Alter=25, Hauptkurs='Computer Science', Note=2.0, Studentenvertreter='true'}, Student{Nachname='Koch', Vorname='Sabine', ID=2, Geschlecht='diverse', Alter=30, Hauptkurs='History', Note=1.7, Studentenvertreter='false'}]}";
//        assertEquals(checkString, studentDB.toString());
//    }
//
//    @Test
//    void checkToStringFalse() {
//        StudentDB studentDB = getTestDB();
//        String checkString = "";
//        assertNotEquals(checkString, studentDB.toString());
//    }
//
//    @Test
//    void checkAddingStudent() {
//        StudentDB studentDB = getTestDB();
//        studentDB.addStudent(new ComputerScienceStudent("Schmitz", "Petra", "female", 18, "Computer Science", 2.0f,true));
//        assertEquals(3, studentDB.list().size());
//    }
//
//    @Test
//    void checkAddingStudentFalse() {
//        StudentDB studentDB = getTestDB();
//        studentDB.addStudent(new ComputerScienceStudent("Schmitz", "Petra", "female", 18, "Computer Science",1.7f, false));
//        assertNotEquals(4, studentDB.list().size());
//    }
//
//    @Test
//    void checkAllStudentsListSize() {
//        StudentDB studentDB = getTestDB();
//        assertEquals(2, studentDB.list().size());
//    }
//
//    @Test
//    void checkAllStudentsListSizeFalse() {
//        StudentDB studentDB = getTestDB();
//        assertNotEquals(3, studentDB.list().size());
//    }
//
//    @Test
//    void checkRemovingStudentID() {
//        StudentDB studentDB = getTestDB();
//        studentDB.removeStudent(1);
//        assertEquals(1, studentDB.list().size());
//    }
//
//    @Test
//    void checkRemovingStudentIDFalse() {
//        StudentDB studentDB = getTestDB();
//        studentDB.removeStudent(1);
//        assertNotEquals(2, studentDB.list().size());
//    }
}