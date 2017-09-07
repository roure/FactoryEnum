package factory;

import domain.Client;
import domain.Country;
import domain.DomainItem;
import domain.Homologation;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

/**
 * Created by josep on 7/9/17.
 */
public enum DomainItemFactory {
    Client(Client::new),
    Country(Country::new),
    Homologation(Homologation::new);

    public final Supplier<DomainItem> factory;

    private DomainItemFactory(Supplier<DomainItem> factory) {
        this.factory = requireNonNull(factory);
    }

    public DomainItem getDomainItem() {
        return factory.get();
    }
}

