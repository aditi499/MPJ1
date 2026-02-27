class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salary) {
        super(salary);
    }

    void calculateSalary() {
        salary = salary + (salary * 0.50);
    }
}

class InternEmployee extends Employee {

    InternEmployee(double salary) {
        super(salary);
    }
    void calculateSalary() {
        salary = salary + (salary * 0.25);
    }
}

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee ft = new FullTimeEmployee(50000);
        InternEmployee intern = new InternEmployee(30000);

        System.out.println("Full Time Employee:");
        System.out.println("Before Hike:");
        ft.displaySalary();
        ft.calculateSalary();
        System.out.println("After 50% Hike:");
        ft.displaySalary();

        System.out.println("\nIntern Employee:");
        System.out.println("Before Hike:");
        intern.displaySalary();
        intern.calculateSalary();
        System.out.println("After 25% Hike:");
        intern.displaySalary();
    }
}

