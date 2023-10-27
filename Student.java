// A class that represents a student
public class Student extends Person {
    // A private field that stores the student ID of the student
    private int id;

    // A public constructor that takes a name and an id as parameters
    public Student(String name, int id) {
        // Call the superclass constructor with the name
        super(name);
        this.id = id;
    }

    // A public method that returns the student ID of the student
    public int getId() {
        return this.id;
    }
}