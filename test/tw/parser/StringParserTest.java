package tw.parser;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringParserTest {

    private String path;

    @Before
    public void setUp() throws Exception {
        path = ".//data//Item_FullCut.txt";

    }

    @Test
    public void should_get_stringList_when_given_path() throws Exception {
        List<String> strings = Guice.createInjector().getInstance(StringParser.class).Parse(path);
        assertThat(strings.get(0), is("ITEM000003"));


    }
}