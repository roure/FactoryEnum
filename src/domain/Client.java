package domain;

/**
 * Created by josep on 7/9/17.
 */
public class Client implements DomainItem {
    private String name;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Client " + name + " says hello!");
    }

    public void buy(double money) {
        System.out.println("Client " + name + " buys for a value of " + money);
    }
}
