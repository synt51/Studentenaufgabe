package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new ComputerScienceStudent("Müller", "Andreas", "male", 25, "Computer Science", 2.0f, true);

    @Test
    void checkLastName() {
        //given
        String lastName = "Müller";
        //when
        assertTrue(student.setLastName(lastName));
        //then
        assertEquals(lastName, student.getLastName());
    }

    @Test
    void checkLastNameFalse() {
        String lastName = "Müller";
        assertFalse(student.setLastName(null));
        assertNotEquals("Schmidt", student.getFirstName());
    }

    @Test
    void checkFirstName() {
        String firstName = "Andreas";
        assertTrue(student.setFirstName(firstName));
        assertEquals(firstName, student.getFirstName());
    }

    @Test
    void checkFirstNameFalse() {
        String firstName = "Andreas";
        assertFalse(student.setFirstName(null));
        assertNotEquals("Klaus", student.getFirstName());
    }

    @Test
    void checkGender() {
        String gender = "male";
        assertTrue(student.setGender(gender));
        assertEquals(gender, student.getGender());
    }

    @Test
    void checkGenderFalse() {
        String gender = "male";
        assertFalse(student.setGender(null));
        assertNotEquals("ajdaoid", student.getGender());
    }

    @Test
    void checkMajorCourse(){
        String majorCourse = "Computer Science";
        assertTrue(student.setMajorCourse(majorCourse));
        assertEquals(majorCourse, student.getMajorCourse());
    }

    @Test
    void checkMajorCourseFalse(){
        String majorCourse = "Computer Science";
        assertFalse(student.setMajorCourse(null));
        assertNotEquals("ahsdahsjd", student.getMajorCourse());
    }

    @Test
    void checkAge() {
        int age = 25;
        student.setAge(age);
        assertEquals(age, student.getAge());
    }

    @Test
    void checkAgeFalse() {
        int age = 25;
        student.setAge(age);
        assertNotEquals(20, student.getAge());
    }

    @Test
    void checkId() {
        int id = 1;
        student.setId(id);
        assertEquals(id, student.getId());
    }

    @Test
    void checkIdFalse() {
        int id = 1;
        student.setId(id);
        assertNotEquals(2, student.getId());
    }
}