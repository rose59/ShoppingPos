package tw.parser;

import com.google.inject.name.Named;

/**
 * Created by 欣 on 2014/12/17.
 */
public class StringParser extends Parser<String> {
    @Override
    @Named("StringParse")
    public String convert(String line) {
        return line;
    }
}
