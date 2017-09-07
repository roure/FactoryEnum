package factory;


import persistence.*;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

/**
 * Created by josep on 7/9/17.
 */
public enum DAOFactory {
    Client(ClientDAO::new),
    Country(CountryDAO::new),
    Homologation(HomologationDAO::new);

    public final Supplier<DAOinterface> factory;

    private DAOFactory(Supplier<DAOinterface> factory) {
        this.factory = requireNonNull(factory);
    }

    public DAOinterface getDAOinterface(BBDD bbdd) {
        DAOinterface dao = factory.get();
        dao.setBBDD(bbdd);
        return dao;
    }
}
