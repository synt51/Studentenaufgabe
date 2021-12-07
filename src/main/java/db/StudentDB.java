package db;

import model.ComputerScienceStudent;
import model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentDB {

    private final List<Student> students;

    public StudentDB(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> allStudents() {
        return this.students;
    }

    public boolean removeStudentID(int id) {
        for (Student student : this.students) {
            if (id == student.getId()) {
                return this.students.remove(student);
            }
        }
        return false;
    }

    public Student randomStudent() {
        int rand = (int) (1 + (Math.random() * (this.students.size() + 1)));
        List<Student> studentID = this.students.stream().filter(student -> student.getId() == rand).collect(Collectors.toList());
        if (studentID.isEmpty()) {
            return new ComputerScienceStudent("Bombadil", "Tom", 0, "diverse", 500, "Maiar");
        }
        return studentID.get(0);
    }

    public boolean removeStudent(Student student) {
        return this.students.remove(student);
    }
}
