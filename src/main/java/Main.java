import db.StudentDB;
import model.ComputerScienceStudent;
import model.HistoryStudent;
import model.Student;
import model.StudentAbstract;
import model.University;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        University university = new University();

        System.out.println("Willkommen in der " + university.getName() + ".");
//        StudentAbstract historyStudent = new HistoryStudent(1,"Schnee", "Jon", "male", 23, "History", 1.1f, true);
//        university.addStudent(historyStudent);
//        StudentAbstract computerScienceStudent = new ComputerScienceStudent(2, "Sand", "Ellaria", "female", 40, "Computer Science", 1.7f, false);
//        university.addStudent(computerScienceStudent);
//        computerScienceStudent = new ComputerScienceStudent(3, "Baratheon", "Joffrey", "male", 19, "Computer Science", 3.7f, false);
//        university.addStudent(computerScienceStudent);
//        historyStudent = new HistoryStudent(4,"Stark", "Ned", "male", 38,"History", 1.3f, true);
//        university.addStudent(historyStudent);
//        computerScienceStudent = new ComputerScienceStudent(5, "Tarly", "Samwell",  "male", 22, "Computer Science", 0.8f, false);
//        university.addStudent(computerScienceStudent);

        StudentDB studentDB = new StudentDB(new HashMap<Integer, StudentAbstract>());

        Map<Integer, StudentAbstract> students = studentDB.list();
        studentDB.addStudent(new HistoryStudent("Stark", "Eddard", "male", 38, "History", 1.3f, true));
        studentDB.addStudent(new HistoryStudent("Test", "McTest", "male", 38, "History", 1.3f, true));
        System.out.println(studentDB.list());
        System.out.println(students.get(2));
        System.out.println(studentDB.getStudentCount());
        System.out.println(studentDB.randomStudent());
        studentDB.removeStudent(1);
        System.out.println(studentDB.list());
        System.out.println(studentDB.getStudentCount());
        studentDB.addStudent(new HistoryStudent("Tarly", "Samwell", "male", 22, "History", 0.8f, false));
        studentDB.addStudent(new ComputerScienceStudent("Greyjoy", "Theon", "diverse", 25, "Computer Science", 3.4f, false));
        System.out.println(studentDB.list());


        //System.out.println(studentDB.getAverageGrade());
        //System.out.println(university.getStudentList());
        //System.out.println("Immatrikulierte Studenten: " + university.getStudentCount());
        //System.out.println(university.getBestStudents());
        //System.out.println(university.getStudentListRepresentative());
        //System.out.println("Durchschnitt aller Studenten: " + university.getAverageGrade());

    }
}
