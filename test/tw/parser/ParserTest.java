package tw.parser;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ParserTest {

    private Parser<String> parse;
    private String path;

    @Before
    public void setUp() throws Exception {
        parse = new Parser<String>() {
            @Override
            public String convert(String line) {
                return line;
            }
        };
        path = ".//data//itemlist.txt";
    }

    @Test
    public void should_get_BufferedReader_when_given_path() throws Exception {
        System.out.println(parse.getBufferedReader(path));
        assertNotNull(parse.getBufferedReader(path));

    }

    @Test
    public void should_get_line_when_given_path() throws Exception {
        List<String> valueList = parse.Parse(path);
        assertThat(valueList.get(0).toString(),is("ITEM000001:40"));

    }
}