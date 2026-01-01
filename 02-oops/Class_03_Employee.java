class Employee {
    String name;
    int age;
    int salary;

    public static void PrintInfo() {
        System.out.println("Employee Details: ");
    }
}

public class Class_03_Employee {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.age = 28;
        emp.name = "Rajiv";
        emp.salary = 11000;

        Employee.PrintInfo();
        System.out.println("Name = " + emp.name);
        System.out.println("Age= " + emp.age);
        System.out.println("salary= " + emp.salary);
    }
}
