package tw.Property;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;
import tw.parser.Pair;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class QuantityPropertyTest {

    private List<Pair> pairs;

    @Before
    public void setUp() throws Exception {
        pairs = new ArrayList<Pair>();
        pairs.add(new Pair("item01", 3));


    }

    @Test
    public void should_get_quantityMap_when_given_pairList() throws Exception {
        QuantityProperty quantityProperty = Guice.createInjector().getInstance(QuantityProperty.class);
        quantityProperty.setQuantityProperty(pairs);
        assertThat(quantityProperty.getMap().get("item01"), is(3));

    }
}