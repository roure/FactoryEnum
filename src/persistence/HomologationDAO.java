package persistence;

import domain.DomainItem;
import domain.Homologation;

import java.util.List;

/**
 * Created by josep on 7/9/17.
 */
public class HomologationDAO implements DAOinterface{
    private BBDD bbdd;

    public HomologationDAO() {
    }

    public HomologationDAO(BBDD bbdd) {
        this.bbdd = bbdd;
    }

    @Override
    public void setBBDD(BBDD bbdd) {
        this.bbdd = bbdd;
    }

    @Override
    public List<DomainItem> getDataFromTable() {
        return bbdd.getHomologations();
    }

    @Override
    public DomainItem getElementById(String id) {
        return bbdd.getHomologation(id);
    }

    @Override
    public void updateElementById(String id, DomainItem domainItem) {
        bbdd.updateHomologation(id, (Homologation) domainItem);
    }
}
