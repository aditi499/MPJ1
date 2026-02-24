class Student {

    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else
            return "D";
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ayush", 101, 88.5);
        Student s2 = new Student("Riya", 102, 92.0);

        System.out.println("Student 1 Details:");
        s1.displayDetails();
        System.out.println("Grade: " + s1.calculateGrade());

        System.out.println("\nStudent 2 Details:");
        s2.displayDetails();
        System.out.println("Grade: " + s2.calculateGrade());
    }
}
