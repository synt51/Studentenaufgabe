package model;

public abstract class StudentAbstract implements Student {

    private String lastName;
    private String firstName;
    private int id;
    private String gender;
    private int age;
    private String majorCourse;

    public StudentAbstract(String lastName, String firstName, int id, String gender, int age, String majorCourse){
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.majorCourse = majorCourse;
    }

    abstract public int anzahlModule();

    @Override
    public String getLastName(){
        return lastName;
    }
    @Override
    public boolean setLastName(String lastName){
        if (lastName == null || lastName.isEmpty()){
            return false;
        }
        this.lastName = lastName;
        return true;
    }
    @Override
    public String getFirstName(){
        return firstName;
    }
    @Override
    public boolean setFirstName(String firstName){
        if (firstName == null || firstName.isEmpty()){
            return false;
        }
        this.firstName = firstName;
        return true;
    }
    @Override
    public int getId(){
        return id;
    }
    @Override
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String getGender(){
        return gender;
    }
    @Override
    public boolean setGender(String gender){
        if (gender == "male" || gender == "female" || gender == "diverse"){
            this.gender = gender;
            return true;
        }
        return false;
    }
    @Override
    public int getAge(){
        return age;
    }
    @Override
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String getMajorCourse(){
        return majorCourse;
    }
    @Override
    public boolean setMajorCourse(String majorCourse){
        if(majorCourse.isEmpty() || majorCourse == null){
            return false;
        }
        this.majorCourse = majorCourse;
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Nachname='" + lastName + '\'' +
                ", Vorname='" + firstName + '\'' +
                ", ID=" + id +
                ", Geschlecht='" + gender + '\'' +
                ", Alter=" + age +
                ", Hauptkurs='" + majorCourse + '\'' +
                '}';
    }
}
