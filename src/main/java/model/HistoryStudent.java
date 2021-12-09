package model;



public class HistoryStudent extends StudentAbstract{

    public HistoryStudent(String lastName, String firstName, String gender, int age, String majorCourse, float studentGrade, boolean representative){
        super(lastName, firstName, gender, age, majorCourse, studentGrade, representative);

    }

    @Override
    public int anzahlModule(){
        return 12;
    }
}
