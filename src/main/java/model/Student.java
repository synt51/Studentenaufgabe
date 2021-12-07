package model;

import java.util.Objects;

public interface Student {

    public static final int MINIMUM_AGE = 18;

    int getAge();

    void setAge(int age);


    String getFirstName();

    boolean setFirstName(String firstName);

    int getId();

    void setId(int id);

    String getLastName();

    boolean setLastName(String lastName);

    String getGender();

    boolean setGender(String gender);

    String getMajorCourse();

    boolean setMajorCourse(String majorCourse);

    @Override
    String toString();
//    {
//        return "Student{" +
//                "Nachname= '" + lastName + '\'' +
//                ", Vorname= '" + firstName + '\'' +
//                ", ID= " + id +
//                ", Geschlecht= '" + gender + '\'' +
//                ", Alter= " + age +
//                '}';
//    }

    @Override
    boolean equals(Object o);
//    {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && id == student.id && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(gender, student.gender);
//    }

    @Override
    int hashCode();
//    {
//        return Objects.hash(age, firstName, lastName, gender, id);
//    }
}
