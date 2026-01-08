class Person1 {
    String name;
    String Address;
}
class Emp1 extends Person1 {
    int EmpId;
    int Salary;
    void Emp(String name, String add, int id, int Salary) {
        this.name = name;
        this.Address = add;
        this.EmpId = id;
        this.Salary = Salary;
        System.out.println("Name: " + name);
        System.out.println("Address: " + Address);
        System.out.println("Employee id: " + EmpId);
        System.out.println("Salary: " + Salary);
    }
}

public class OOP_23_InheritanceEmpManagement {
    public static void main(String[] args) {
        Emp1 e1 = new Emp1();
        e1.Emp("Nikhil", "Kadi" , 01, 10000);
    }
}
