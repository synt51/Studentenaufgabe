package model;

public class ComputerScienceStudent extends StudentAbstract{

    public ComputerScienceStudent(String lastName, String firstName, String gender, int age, String majorCourse, float studentGrade, boolean representative){
        super(lastName, firstName, gender, age, majorCourse, studentGrade, representative);
    }

    @Override
    public int anzahlModule(){
        return 16;
    }
}
