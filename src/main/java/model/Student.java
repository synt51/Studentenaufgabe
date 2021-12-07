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

    double getStudentGrade();

    void setStudentGrade(double studentGrade);

    boolean isRepresentative();

    void setRepresentative(boolean representative);
    @Override
    String toString();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
