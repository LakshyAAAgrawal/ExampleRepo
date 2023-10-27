// A class that represents a course
public class Course {
    // A private field that stores the name of the course
    private String name;

    // A private field that stores the teacher of the course
    private Teacher teacher;

    // A private field that stores an array of students enrolled in the course
    private Student[] students;

    // A public constructor that takes a name, a teacher, and an array of students as parameters
    public Course(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    // A public method that returns the name of the course
    public String getName() {
        return this.name;
    }

    // A public method that returns the teacher of the course
    public Teacher getTeacher() {
        return this.teacher;
    }

    // A public method that returns an array of students enrolled in the course
    public Student[] getStudents() {
        return this.students;
    }
}