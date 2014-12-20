package tw.shopping;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;
import tw.item.Item;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShoppingCartPrintingTest {

    private ArrayList<ShoppingItem> shoppingItems;

    @Before
    public void setUp() throws Exception {
        shoppingItems = new ArrayList<ShoppingItem>();
        shoppingItems.add(new ShoppingItem(new Item("item01", 20.0), 2));

    }

    @Test
    public void should_printCart_when_given_shoppingCart() throws Exception {
        ShoppingCart shoppingCart = Guice.createInjector().getInstance(ShoppingCart.class);
        shoppingCart.setShoppingItems(shoppingItems);
        ShoppingCartPrinting mock = mock(ShoppingCartPrinting.class);
        mock.printCart(10.0);
        verify(mock).printCart(10.0);

    }
}