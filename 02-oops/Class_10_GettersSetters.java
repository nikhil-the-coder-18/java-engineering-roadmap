// WAP to use getters ans setters in java.
// Date: 03/01/2025
// Author: Nikhil

class NewEmployee {
    String name;
    int salary;

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Class_10_GettersSetters {
    public static void main(String[] args) {
        NewEmployee emp = new NewEmployee();

        emp.setName("Nikhil");
        emp.setSalary(20000);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}