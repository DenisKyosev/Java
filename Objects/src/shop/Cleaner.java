package shop;

public class Cleaner extends Employee {

    public Cleaner(String name, int age) {
        super(name, age, Departments.Laborer);
    }

    @Override
    public void work() {
        System.out.println("Cleaning the shop");
    }

}