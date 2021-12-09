package db;

import model.Student;
import model.StudentAbstract;

import java.util.*;

public class StudentDB {

    HashMap<Integer, StudentAbstract> students = new HashMap<>();
    int lastId;

    public StudentDB(HashMap<Integer, StudentAbstract> students) {
        lastId = 0;
        this.students = students;
    }

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

    public Map<Integer, StudentAbstract> list(){
        return students;
    }

    public Student randomStudent(){

        return students.get((int)(Math.random() * students.size()));
    }

    public void removeStudent (int lastId){

        this.students.remove(lastId);
    }

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