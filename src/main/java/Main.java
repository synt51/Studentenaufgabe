import db.StudentDB;
import model.ComputerScienceStudent;
import model.HistoryStudent;
import model.Student;
import model.StudentAbstract;
import model.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        University university = new University();

        System.out.println("Willkommen in der " + university.getName() + ".");
        StudentAbstract historyStudent = new HistoryStudent("Schnee", "Jon", 1, "male", 23, "History", 1.1f, true);
        university.addStudent(historyStudent);
        StudentAbstract computerScienceStudent = new ComputerScienceStudent("Sand", "Ellaria", 2, "female", 40, "Computer Science", 1.7f, false);
        university.addStudent(computerScienceStudent);
        computerScienceStudent = new ComputerScienceStudent("Baratheon", "Joffrey", 3, "male", 19, "Computer Science", 3.7f, false);
        university.addStudent(computerScienceStudent);
        historyStudent = new HistoryStudent("Stark", "Ned", 4, "male", 38,"History", 1.3f, true);
        university.addStudent(historyStudent);
        computerScienceStudent = new ComputerScienceStudent("Tarly", "Samwell", 5, "male", 22, "Computer Science", 0.8f, false);
        university.addStudent(computerScienceStudent);

        university.removeStudent(3);

        System.out.println(university.getStudentList());
        System.out.println("Immatrikulierte Studenten: " + university.getStudentCount());
        //System.out.println(university.getBestStudents());
        System.out.println(university.getStudentListRepresentative());
        System.out.println("Durchschnitt aller Studenten: " + university.getAverageGrade());
    }
}
