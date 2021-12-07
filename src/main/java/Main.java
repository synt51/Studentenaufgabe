import db.StudentDB;
import model.ComputerScienceStudent;
import model.HistoryStudent;
import model.Student;
import model.StudentAbstract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentAbstract historyStudent = new HistoryStudent("Schnee", "Jon", 4, "male", 23, "History", 1.2, true);
        StudentAbstract computerScienceStudent = new ComputerScienceStudent("Sand", "Ellaria", 3, "female", 40, "Computer Science", 1.7, false);

        System.out.println(historyStudent);

        System.out.println(historyStudent.getLastName() + ", " + historyStudent.getFirstName() + " " + historyStudent.anzahlModule()+ ". Modul");
        System.out.println(computerScienceStudent.getLastName() + ", " + computerScienceStudent.getFirstName() + " " + computerScienceStudent.anzahlModule()+ ". Modul");


    }
}
