package persistence;

import domain.Client;
import domain.DomainItem;

import java.util.List;

/**
 * Created by josep on 7/9/17.
 */
public class ClientDAO implements DAOinterface {
    private BBDD bbdd;

    public ClientDAO() {
    }

    public ClientDAO(BBDD bbdd) {
        this.bbdd = bbdd;
    }

    public void setBBDD(BBDD bbdd) {
        this.bbdd = bbdd;
    }

    @Override
    public List<DomainItem> getDataFromTable() {
        return bbdd.getClients();
    }

    @Override
    public DomainItem getElementById(String id) {
        return bbdd.getClient(id);
    }

    @Override
    public void updateElementById(String id, DomainItem domainItem) {
        bbdd.updateClient(id, (Client) domainItem);
    }
}
