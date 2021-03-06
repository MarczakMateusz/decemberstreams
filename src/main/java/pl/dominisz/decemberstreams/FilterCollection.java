package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterCollection {

    public static List<String> transform7(List<String> collection) {
        List<String>result = new ArrayList<>();
        for (String string : collection) {
            if(string.length() < 4){
                result.add(string);
            }
        }
        return result;
    }

    public static List<String> transform(List<String> collection) {
        return collection.stream().filter(s -> s.length()> 4).collect(Collectors.toList());
    }

}
