package model;



public abstract class StudentAbstract implements Student {


    private int id;
    private String lastName;
    private String firstName;
    private String gender;
    private int age;
    private String majorCourse;
    private float studentGrade;
    private boolean representative;

    public StudentAbstract(String lastName, String firstName, String gender, int age, String majorCourse, float studentGrade, boolean representative) {
        //this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.majorCourse = majorCourse;
        this.studentGrade = studentGrade;
        this.representative = representative;
    }

    abstract public int anzahlModule();


    public String getLastName() {
        return lastName;
    }

    public boolean setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            return false;
        }
        this.lastName = lastName;
        return true;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            return false;
        }
        this.firstName = firstName;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public boolean setGender(String gender) {
        if (gender == "male" || gender == "female" || gender == "diverse") {
            this.gender = gender;
            return true;
        }
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajorCourse() {
        return majorCourse;
    }

    public boolean setMajorCourse(String majorCourse) {
        if (majorCourse.isEmpty() || majorCourse == null) {
            return false;
        }
        this.majorCourse = majorCourse;
        return true;
    }


    public float getStudentGrade() {
        return studentGrade;
    }


    public void setStudentGrade(float studentGrade) {
        this.studentGrade = studentGrade;
    }


    public boolean isRepresentative() {
        return representative;
    }

    public void setRepresentative(boolean representative) {
        this.representative = representative;
    }


    @Override
    public String toString() {
        return  "Student{" +
                " Nachname='" + lastName + '\'' +
                ", Vorname='" + firstName + '\'' +
                ", Geschlecht='" + gender + '\'' +
                ", Alter=" + age +
                ", Hauptkurs='" + majorCourse + '\'' +
                ", Note=" + studentGrade +
                ", Studentenvertreter='" + representative + '\'' +
                '}' + '\n';
    }

}
