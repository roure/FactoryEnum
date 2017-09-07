import domain.Client;
import domain.DomainItem;
import factory.DAOFactory;
import factory.DomainItemFactory;
import persistence.BBDD;
import persistence.DAOinterface;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        /*****************************************************************
         * Trying the DomainItem factory
         *****************************************************************/
        DomainItem item;

        item = DomainItemFactory.valueOf("Client").getDomainItem();
        item.setName("Sergi");
        item.hello();

        item = DomainItemFactory.valueOf("Country").getDomainItem();
        item.setName("Catalunya");
        item.hello();

        item = DomainItemFactory.valueOf("Homologation").getDomainItem();
        item.setName("Cambridge");
        item.hello();


        /********************************************************************
         * Trying the DAO Factory
         ********************************************************************/

        BBDD bbdd = new BBDD();
        DAOinterface daOinterface;

        daOinterface = DAOFactory.valueOf("Client").getDAOinterface(bbdd);
        item = daOinterface.getElementById("2");
        item.hello();

        item.setName("Pepe");
        daOinterface.updateElementById("2", item);

        // get Pepe as Client rather than as DomainItem
        Client client;
        client = (Client) daOinterface.getElementById("2");
        client.buy(10.2);


    }
}
