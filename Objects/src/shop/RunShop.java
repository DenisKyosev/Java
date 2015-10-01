package shop;

import java.math.BigDecimal;

public final class RunShop {

    private RunShop() {

    }

    public static void main(String[] args) {
        Shop market = new Shop("The Shop");

        Employee dimitar = new Employee("Dimitar", 23, Departments.Accounting);
        Client pesho = new Client("Pesho", 29);
        Product water = new Product("Natural water", "Water for drinking", new BigDecimal("0.99"),25);

        market.addClient(pesho);
        market.addEmployee(dimitar);
        market.addProduct(water);
        market.buy(pesho.getClientID(), water.getProductID());

        System.out.println(dimitar.getEmployeeID());

        Employee ivan = new Employee("Ivan", 30, Departments.Cashier);
        market.addEmployee(ivan);
        System.out.println(ivan.getEmployeeID());
    }
}