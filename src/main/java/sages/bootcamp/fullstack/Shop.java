package sages.bootcamp.fullstack;

/**
 * Created by Jag on 2017-08-24.
 */
public class Shop {
    private Storage storage;

    public Shop(Storage storage) {
        this.storage = storage;
    }

    public String getProductsView() {
        return String.join(
            ", ",
            storage.retrieve()
        );
    }
}
