package shop;

public class Guard extends Employee {

    public Guard(String name, int age) {
        super(name, age, Departments.Security);
    }

    @Override
    public void work() {
        System.out.println("Secure the shop's premisses");
    }

}