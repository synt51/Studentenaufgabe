package db;

import model.Student;
import model.StudentAbstract;

import java.util.*;

public class StudentDB {

    //private final List<Student> students;

    HashMap<Integer, StudentAbstract> students = new HashMap<>();

    int lastId;


    public StudentDB(HashMap<Integer, StudentAbstract> students) {
        lastId = 0;
        this.students = students;
    }

//    public StudentDB(){
//        lastId = 0;
//    }

    public void addStudent(StudentAbstract student) throws RuntimeException {

        lastId += 1;

        if (this.students.containsKey(lastId)){   //student.getId() -> lastId
            throw new RuntimeException("Etwas ist schief gelaufen.");
        } else {
            this.students.put(lastId, student);
       }
    }

    public int getStudentCount() {
        return students.size();
    }

//    public List<Student> allStudents() {
//        return this.students;
//    }

//    public boolean removeStudentID(int id) {
//        for (Student student : this.students) {
//            if (id == student.getId()) {
//                return this.students.remove(student);
//            }
//        }
//        return false;
//    }

    public Map<Integer, StudentAbstract> list(){
        return students;
    }
    public Student randomStudent(){
        return students.get((int)(Math.random() * students.size()));
    }
//    public Student randomStudent() {
//        int rand = (int) (1 + (Math.random() * (this.students.size() + 1)));
//        List<Student> studentID = this.students.stream().filter(student -> student.getId() == rand).collect(Collectors.toList());
//        if (studentID.isEmpty()) {
//            return new ComputerScienceStudent(0,"Bombadil", "Tom", "diverse", 500, "Maiar", 0.6f, true);
//        }
//        return studentID.get(0);
//    }

    public void removeStudent (int lastId){
        this.students.remove(lastId);
    }
//    public boolean removeStudent(Student student) {
//        return this.students.remove(student);
//    }

//    public float getAverageGrade() {
//        float avg = 0f;
//        for (StudentAbstract studentAbstract : students) {
//            avg += studentAbstract.getStudentGrade();
//        }
//        avg = avg / students.size();
//        return avg;
//    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
