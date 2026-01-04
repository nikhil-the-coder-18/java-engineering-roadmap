// WAP to Create a class Employee with following properties and methods:
// Salary (property) (int)
// getSalary( method returning int)
// name (property) (sting)
// getName (method returning Sting)
// SetName (method changing name)
// Date: 01/01/2026
// Author: Nikhil

import java.util.Scanner;

class Employee2 {
    Scanner ip = new Scanner(System.in);

    int Salary;
    String name;

    public void setName(String getingname) {
        name = getingname;
    }

    public String getName() {
        return name;
    }

    public int getSalary () {
        System.out.println("Enter Salary: ");
        Salary = ip.nextInt();
        return Salary;
    }

}
public class OOP_04_EmployeeDetailed {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();

        emp.setName("Nikhil");

        System.out.println("Name= " + emp.getName());
        System.out.print("Salary= " + emp.getSalary());
    }
}
