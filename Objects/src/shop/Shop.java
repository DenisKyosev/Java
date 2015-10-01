package shop;

import java.math.BigDecimal;
import java.util.HashMap;

public class Shop extends AbstractShop {

    private HashMap<Integer, Employee> employees;
    private HashMap<Integer, Product> products;
    private HashMap<Integer, Client> clients;
    private String name;
    private BigDecimal profit;

    public Shop(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("The shop's name cannot be empty");
        }

        this.name = name;
        this.employees = new HashMap<>();
        this.clients = new HashMap<>();
        this.products = new HashMap<>();
        this.profit = new BigDecimal("0");
    }

    // the shop's name
    public String getName() {
        return name;
    }

    //the shop's profit
    public BigDecimal getProfit() {
        return profit;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getEmployeeID(), employee);
    }

    @Override
    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    @Override
    public void addClient(Client client) {
        clients.put(client.getClientID(), client);
    }

    @Override
    public void buy(int clientID, int productID) {
        if (!products.containsKey(productID)) {
            throw new IllegalArgumentException("No such product with ID : " + productID);
        }
        if (!clients.containsKey(clientID)) {
            throw new IllegalArgumentException("No such client with ID : " + clientID);
        }

        Product product = products.get(productID);
        product.setAmount(product.getAmount() - 1);

        BigDecimal price = product.getPrice();
        profit.add(price);
    }

}