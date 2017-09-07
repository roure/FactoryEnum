package persistence;

import domain.Country;
import domain.DomainItem;

import java.util.List;

/**
 * Created by josep on 7/9/17.
 */
public class CountryDAO implements DAOinterface {
    private BBDD bbdd;

    public CountryDAO() {
    }

    public CountryDAO(BBDD bbdd) {
        this.bbdd = bbdd;
    }

    @Override
    public void setBBDD(BBDD bbdd) {
        this.bbdd = bbdd;
    }

    @Override
    public List<DomainItem> getDataFromTable() {
        return bbdd.getCountries();
    }

    @Override
    public DomainItem getElementById(String id) {
        return bbdd.getCountry(id);
    }

    @Override
    public void updateElementById(String id, DomainItem domainItem) {
        bbdd.updateCountry(id, (Country) domainItem);
    }
}
