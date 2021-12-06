import model.Student;

public class Main {
    public static void main(String[] args) {
        Student andreas = new Student("Müller", "Andreas", "male", 25);
        Student sabine = new Student ("Koch", "Sabine", "diverse", 30);
//        String andreasLastName = andreas.getLastName();
//        String andreasFirstName = andreas.getFirstName();
//        String andreasGender = andreas.getGender();
//        int andreasAge = andreas.getAge();
//
//        System.out.println("Nachname: " + andreasLastName);
//        System.out.println("Vorname: " + andreasFirstName);
//        System.out.println("Geschlecht: " + andreasGender);
//        System.out.println("Alter: " + andreasAge);


        System.out.println(andreas.toString());
        System.out.println(sabine.toString());
    }
}
