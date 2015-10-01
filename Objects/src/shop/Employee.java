package shop;

public class Employee extends Person {

    private static int employeeID = 0;
    private Departments department;

    public Employee(String name, int age, Departments department) {
        super(name, age);
        this.department = department;
        Employee.employeeID++;
    }
    public int getEmployeeID() {
        return employeeID;
    }

    public Departments getEmployeeDepartment() {
        return department;
    }

    public void work() {

    }

}