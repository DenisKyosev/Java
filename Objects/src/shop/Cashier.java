package shop;

public class Cashier extends Employee {

    public Cashier(String name, int age) {
        super(name, age, Departments.Cashier);
    }

    @Override
    public void work() {
        System.out.println("Paymaster");
    }

}