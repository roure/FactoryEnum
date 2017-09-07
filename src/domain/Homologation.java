package domain;

/**
 * Created by josep on 7/9/17.
 */
public class Homologation implements DomainItem {
    private String name;

    public Homologation() {
    }

    public Homologation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello () {
        System.out.println("Homologation " + name + " says hello");
    }
}
