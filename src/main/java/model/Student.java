package model;

public class Student {

    int age;
    String firstName;
    String lastName;
    String gender;

    public Student(String lastName, String firstName, String gender, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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



    @Override
    public String toString() {
        return "Student{" +
                "Alter=" + age +
                ", Vorname='" + firstName + '\'' +
                ", Nachname='" + lastName + '\'' +
                ", Geschlecht='" + gender + '\'' +
                '}';
    }
}
