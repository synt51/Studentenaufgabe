package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class University {


    /*
    Attribute:
    Name der Uni
    Array mit allen Studenten
    Studentenvertretung

    Methoden:
    listStudents -> gibt alle Studenten zurück
    getStudentCount -> gibt die Anzahl an Studenten zurück
    addStudent -> einen Student einschreiben
    removeStudent -> einen Student entfernen
    getBestStudent -> bester Student
    getAverageGrade -> Durchschnitt aller Studenten
    setStudentRepresentative -> Studentenvertreter setzen
     */

    private final String name = "Zitadelle von Altsass";
    private StudentAbstract studentRepresentative;
    //private List<StudentAbstract> studentList = new ArrayList<>();
    Map<Integer, StudentAbstract> studentList;

    public String getName() {
        return name;
    }

    public Map<Integer, StudentAbstract> getStudentList() {
        return this.studentList;
    }


    public int getStudentCount() {
        return studentList.size();
    }

    public void addStudent(StudentAbstract studentAbstract) {

        studentList.put(studentAbstract.getId(), studentAbstract);
    }

    public void removeStudent (Student student){
        this.studentList.remove(student.getId());
    }
//    public boolean removeStudent(int id) {
//        for (Student student : studentList) {
//            if (id == student.getId()) {
//                return studentList.remove(student);
//            }
//        }
//        return false;
//    }

//    public StudentAbstract getBestStudents() {
//        return false;
//    }

//    public boolean getStudentListRepresentative() {
//        for (StudentAbstract studentAbstract : studentList){
//            if (studentAbstract.isRepresentative() == true){
//                studentRepresentative = studentAbstract;
//                return true;
//            }
//        }
//        return false;
//    }

//    public float getAverageGrade() {
//        float avg = 0f;
//        for (StudentAbstract studentAbstract : studentList) {
//            avg += studentAbstract.getStudentGrade();
//        }
//        avg = avg / studentList.size();
//        return avg;
//    }
}
