package tw.parser;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringAndNumberParserTest {

    private String path;

    @Before
    public void setUp() throws Exception {
        path = ".//data//itemlist.txt";

    }

    @Test
    public void should_get_Pair_when_given_path() throws Exception {
        List<Pair> pairs= Guice.createInjector().getInstance(StringAndNumberParser.class).Parse(path);
        assertThat(pairs.get(0).getName(), is("ITEM000001"));
        assertThat(pairs.get(1).getValue(), is(50));

    }
}