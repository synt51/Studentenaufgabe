import db.StudentDB;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student = new Student("Müller", "Andreas", 1, "male", 25);

        students.add(student);
        students.add(new Student("Müller", "Andreas", 1, "male", 25));
        students.add(new Student("Mayer", "John John", 2, "diverse", 30));
        students.add(new Student("Sand", "Ellaria", 3, "female", 40));
        students.add(new Student("Schnee", "Jon", 4, "male", 23));
        students.add(new Student("Strom", "Brynden", 5, "male", 70));
        students.add(new Student("Stein", "Sabine", 6, "diverse", 30));
        students.add(new Student("Wasser", "Gendry", 7, "male", 19));
        students.add(new Student("Sturm", "Sabine", 8, "diverse", 30));
        students.add(new Student("Hügel", "Robin", 9, "diverse", 30));

        StudentDB studentDB = new StudentDB(students);

        System.out.println(studentDB.randomStudent());

        studentDB.removeStudent(student);
        studentDB.removeStudentID(1);
        System.out.println(studentDB);
    }
}
