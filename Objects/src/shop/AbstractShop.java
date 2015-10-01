package shop;

public abstract class AbstractShop {

    public abstract void addEmployee(Employee employee);

    public abstract void addProduct(Product product);

    public abstract void addClient(Client client);

    public abstract void buy(int clientID, int productID);

}