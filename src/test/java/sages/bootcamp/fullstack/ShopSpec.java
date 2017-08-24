package sages.bootcamp.fullstack;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Jag on 2017-08-24.
 */
public class ShopSpec {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void shouldGetProductsView() throws IOException {
        // given
        Storage storage = Mockito.mock(Storage.class);
        Shop shop = new Shop(storage);
        Mockito.when(storage.retrieve()).thenReturn(Arrays.asList("bread", "milk", "coffee"));
        String expectedProductsView = "bread, milk, coffee";

        // when
        String actualProductsView = shop.getProductsView();

        // then

        Assert.assertEquals(expectedProductsView, actualProductsView);
    }
}
