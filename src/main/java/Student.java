public class Student {

    int age;
    String firstName;
    String lastName;
    String gender;

    public Student(String lastName, String firstName, String gender, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }

    String getFirstName(){
        return firstName;
    }
    boolean setFirstName(String firstName){
        if(firstName == null || firstName.isEmpty()){
            return false;
        }
        this.firstName = firstName;
        return true;
    }

    String getLastName(){
        return lastName;
    }
    boolean setLastName(String lastName){
        if(lastName == null || lastName.isEmpty()){
            return false;
        }
        this.lastName = lastName;
        return true;
    }

    String getGender(){
        return gender;
    }
    boolean setGender(String gender){
        if(gender == "male" || gender == "female" || gender == "diverse") {
            this.gender = gender;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Student andreas = new Student("Müller","Andreas", "male", 25);
        String andreasLastName = andreas.getLastName();
        String andreasFirstName = andreas.getFirstName();
        String andreasGender = andreas.getGender();
        int andreasAge = andreas.getAge();

        System.out.println("Nachname: " + andreasLastName);
        System.out.println("Vorname: " + andreasFirstName);
        System.out.println("Geschlecht: " + andreasGender);
        System.out.println("Alter: " + andreasAge);
    }
}
