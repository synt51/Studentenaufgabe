package model;



public class HistoryStudent extends StudentAbstract{

    public HistoryStudent(String lastName, String firstName,  int id, String gender, int age, String majorCourse){
        super(lastName, firstName, id, gender, age, majorCourse);
    }

    @Override
    public int anzahlModule(){
        return 12;
    }
}
