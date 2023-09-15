class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doubleSalary() {
        salary *= 2;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Иванова", 28, 20000, "HR");
        Employee e2 = new Employee(2, "Андреева", 35, 70000, "IT");

        e1.doubleSalary();
        e2.doubleSalary();

        System.out.println("Новая зарплата сотрудника " + e1.surname + ": " + e1.salary);
        System.out.println("Новая зарплата сотрудника " + e2.surname + ": " + e2.salary);
    }
}