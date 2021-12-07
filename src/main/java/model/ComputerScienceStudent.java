package model;

public class ComputerScienceStudent extends StudentAbstract{

    public ComputerScienceStudent(String lastName, String firstName,  int id, String gender, int age, String majorCourse){
        super(lastName, firstName, id, gender, age, majorCourse);
    }

    @Override
    public int anzahlModule(){
        return 16;
    }
}
