package tw.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PairTest {

    @Test
    public void should_get_pair_when_given_name_and_value() throws Exception {
        Pair pair = new Pair("item01", 10);
        assertThat(pair.getName(),is("item01"));
        assertThat(pair.getValue(),is(10));

    }
}