package model;

public interface Student {

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

    float getStudentGrade();

    void setStudentGrade(float studentGrade);

    boolean isRepresentative();

    void setRepresentative(boolean representative);
    @Override
    String toString();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

}
