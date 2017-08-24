package sages.bootcamp.fullstack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jag on 2017-08-24.
 */
public class Storage {
    private List<String> products = new ArrayList<>();

    void store(List<String> newProducts) {
        this.products = newProducts;
    }

    List<String> retrieve() {
        return products;
    }
}
