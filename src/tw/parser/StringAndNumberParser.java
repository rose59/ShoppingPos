package tw.parser;

import com.google.inject.name.Named;

/**
 * Created by 欣 on 2014/12/17.
 */
public class StringAndNumberParser extends Parser<Pair> {

    @Override
    @Named("StringAndNumberParser")
    public Pair convert(String line) {
        if (line.contains("-") | line.contains(":")) {
            String[] pair = line.split("-|:");
            return new Pair(pair[0], Integer.valueOf(pair[1]));
        } else return new Pair(line, 1);
    }
}
