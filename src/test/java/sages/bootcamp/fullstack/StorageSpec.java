package sages.bootcamp.fullstack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Jag on 2017-08-24.
 */
public class StorageSpec {

    @Test
    public void shouldBeEmptyAfterCreation() {
        // given
        Storage storage = new Storage();
        List<String> expectedProducts = new ArrayList<>();

        // when
        List<String> actualProducts = storage.retrieve();

        // then

        assertEquals(expectedProducts, actualProducts);
    }

    @Test
    public void shouldRetrieveStoredProducts() {
        // given
        Storage storage = new Storage();
        List<String> expectedProducts = Arrays.asList("bread", "milk", "coffee");

        // when
        storage.store(expectedProducts);
        List<String> actualProducts = storage.retrieve();

        // then
        assertEquals(expectedProducts, actualProducts);
    }
}
