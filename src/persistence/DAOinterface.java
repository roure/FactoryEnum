package persistence;

import domain.DomainItem;

import java.util.List;

/**
 * Created by josep on 7/9/17.
 */
public interface DAOinterface {
    public void setBBDD(BBDD bbdd);
    public List<DomainItem> getDataFromTable();
    public DomainItem getElementById(String id);
    public void updateElementById(String id, DomainItem domainItem);
}
