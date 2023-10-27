// A class that contains the main method to test the code sample
public class Main {
     public static void main(String[] args){
        // Create some student objects
        Student s1 = new Student("Charlie", 1001);
        Student s2 = new Student("David", 1002);
        
        // Create some teacher objects
        Teacher t1 = new Teacher("Eve", "Math");
        Teacher t2 = new Teacher("Frank", "English");
        
        // Create an array of students for each course
        Student[] mathStudents = {s1, s2};
        Student[] englishStudents = {s1};

        // Create some person objects
        Person p1 = new Student("Alice", 10);
        Person p2 = new Teacher("Bob", "Science");
        
        // Create some course objects
        Course c1 = new Course("Math 101", t1, mathStudents);
        Course c2 = new Course("English 101", t2, englishStudents);
        
        // Print some information about the objects
        
        System.out.println("Person p1's name is " + p1.getName());
        
        System.out.println("Student s1's name is " + s1.getName());
        System.out.println("Student s1's id is " + s1.getId());
        
        System.out.println("Teacher t1's name is " + t1.getName());
        System.out.println("Teacher t1's subject is " + t1.getSubject());
        
        System.out.println("Course c1's name is " + c1.getName());
        System.out.println("Course c1's teacher is " + c1.getTeacher().getName());
        
     }
}
