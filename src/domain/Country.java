package domain;

/**
 * Created by josep on 7/9/17.
 */
public class Country implements DomainItem {
    private String name;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Country " + name + " says hello");
    }
}
