import db.StudentDB;
import model.ComputerScienceStudent;
import model.HistoryStudent;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student = new ComputerScienceStudent("Lannister", "Tyrion", 0, "male", 30, "Computer Science");

        students.add(student);
        students.add(new ComputerScienceStudent("Müller", "Andreas", 1, "male", 25, "Computer Science"));
        students.add(new HistoryStudent("Mayer", "John John", 2, "diverse", 30, "History"));
        students.add(new ComputerScienceStudent("Sand", "Ellaria", 3, "female", 40, "Computer Science"));
        students.add(new HistoryStudent("Schnee", "Jon", 4, "male", 23, "History"));
        students.add(new HistoryStudent("Strom", "Brynden", 5, "male", 70, "History"));
        students.add(new ComputerScienceStudent("Stein", "Sabine", 6, "diverse", 30, "Computer Science"));
        students.add(new HistoryStudent("Wasser", "Gendry", 7, "male", 19, "History"));
        students.add(new ComputerScienceStudent("Sturm", "Sabine", 8, "diverse", 30, "Computer Science"));
        students.add(new ComputerScienceStudent("Hügel", "Robin", 9, "diverse", 30, "Computer Science"));

        StudentDB studentDB = new StudentDB(students);

       // System.out.println(studentDB.randomStudent());

        Student student2 = new HistoryStudent("Stark","Ned",10, "male", 46,"History");
        studentDB.removeStudent(student);
        studentDB.removeStudentID(0);
        System.out.println(studentDB);
        System.out.println(student2);

    }
}
