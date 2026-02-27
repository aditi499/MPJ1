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
        Student s3 = new Student("Harshita", 106, 94.0);
        Student s4 = new Student("Aditi", 109, 91.8);
        Student s5 = new Student("Aarya", 105, 97.8);
        
        System.out.println("Student 1 Details:");
        s1.displayDetails();
        System.out.println("Grade: " + s1.calculateGrade());

        System.out.println("\nStudent 2 Details:");
        s2.displayDetails();
        System.out.println("Grade: " + s2.calculateGrade());

        System.out.println("Student 3 Details:");
        s3.displayDetails();
        System.out.println("Grade: " + s3.calculateGrade());

        System.out.println("Student 4 Details:");
        s4.displayDetails();
        System.out.println("Grade: " + s4.calculateGrade());

        System.out.println("Student 5 Details:");
        s5.displayDetails();
        System.out.println("Grade: " + s5.calculateGrade());
    }
}

