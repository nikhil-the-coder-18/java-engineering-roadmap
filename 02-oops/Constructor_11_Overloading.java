// WAP to Overload the Employee Constructor to initialize the salary
// to rs 10,0000
// Date: 03/01/2025
// Author: Nikhil

class employee2 {
    int salary;

    employee2() {
        salary = 10000;
    }

    employee2(int s) {
        salary = s;
    }
}

public class Constructor_11_Overloading {
    public static void main(String[] args) {

        employee2 emp1 = new employee2();     // Default Constructor
        employee2 emp2 = new employee2(15000);   // parameterized Constructor

        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
    }
}
