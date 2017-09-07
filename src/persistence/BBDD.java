package persistence;

import domain.Client;
import domain.Country;
import domain.DomainItem;
import domain.Homologation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by josep on 7/9/17.
 */
public class BBDD {
    private Map<String, Client> clientMap = new HashMap<>();
    private Map<String, Country> countryMap = new HashMap<>();
    private Map<String, Homologation> homologationMap = new HashMap<>();

    public BBDD() {
        clientMap.put("1", new Client("Sergi"));
        clientMap.put("2", new Client("Josep"));

        countryMap.put("1", new Country("Catalunya"));
        countryMap.put("2", new Country("USA"));

        homologationMap.put("1", new Homologation("Cambridge"));
        homologationMap.put("2", new Homologation(("Oxford")));
    }

    public DomainItem getClient(String id) {
        return clientMap.get(id);
    }

    public List<DomainItem> getClients() {
        return new ArrayList<DomainItem>(clientMap.values());
    }

    public void updateClient(String id, Client client) {
        clientMap.replace(id, client);
    }

    public DomainItem getCountry(String id) {
        return countryMap.get(id);
    }

    public List<DomainItem> getCountries() {
        return new ArrayList<DomainItem>(countryMap.values());
    }

    public void updateCountry(String id, Country country) {
        countryMap.replace(id, country);
    }

    public DomainItem getHomologation(String id) {
        return homologationMap.get(id);
    }

    public List<DomainItem> getHomologations() {
        return new ArrayList<DomainItem>(homologationMap.values());
    }

    public void updateHomologation(String id, Homologation homologation) {
        homologationMap.replace(id, homologation);
    }
}
