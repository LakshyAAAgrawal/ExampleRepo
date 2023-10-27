// A class that represents a person
public abstract class Person {
    // A private field that stores the name of the person
    private String name;

    // A public constructor that takes a name as a parameter
    public Person(String name) {
        this.name = name;
    }

    // A public method that returns the name of the person
    public String getName() {
        return this.name;
    }
}