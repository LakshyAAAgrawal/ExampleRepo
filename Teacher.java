// A class that represents a teacher
public class Teacher extends Person {
    // A private field that stores the subject of the teacher
    private String subject;

    // A public constructor that takes a name and a subject as parameters
    public Teacher(String name, String subject) {
        // Call the superclass constructor with the name
        super(name);
        this.subject = subject;
    }

    // A public method that returns the subject of the teacher
    public String getSubject() {
        return this.subject;
    }
}