package model;

public class ComputerScienceStudent extends StudentAbstract{

    String lastName;
    String firstName;
    int age;
    String gender;
    int id;
    String majorCourse;

    public ComputerScienceStudent(String lastName, String firstName,  int id, String gender, int age, String majorCourse){
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.majorCourse = majorCourse;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            return false;
        }
        this.firstName = firstName;
        return true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            return false;
        }
        this.lastName = lastName;
        return true;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public boolean setGender(String gender) {
        if (gender == "male" || gender == "female" || gender == "diverse") {
            this.gender = gender;
            return true;
        }
        return false;
    }

    @Override
    public String getMajorCourse() {
        return majorCourse;
    }

    @Override
    public boolean setMajorCourse(String majorCourse){
        if (majorCourse == "Computer Science"){
            this.majorCourse = majorCourse;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Nachname= '" + lastName + '\'' +
                ", Vorname= '" + firstName + '\'' +
                ", ID= " + id +
                ", Geschlecht= '" + gender + '\'' +
                ", Alter= " + age +
                ", Hauptstudium= '" + majorCourse + '\'' +
                '}';
    }
}
