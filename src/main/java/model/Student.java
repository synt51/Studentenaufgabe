package model;

import java.util.Objects;

public class Student {

    int age;
    String firstName;
    String lastName;
    String gender;
    int id;

    public Student(String lastName, String firstName, int id, String gender, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "Nachname= '" + lastName + '\'' +
                ", Vorname= '" + firstName + '\'' +
                ", ID= " + id +
                ", Geschlecht= '" + gender + '\'' +
                ", Alter= " + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && id == student.id && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, gender, id);
    }
}
