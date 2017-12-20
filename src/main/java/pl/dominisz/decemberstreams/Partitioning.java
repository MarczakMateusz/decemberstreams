package pl.dominisz.decemberstreams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        return new HashMap<>();
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream().collect(partitioningBy(Person -> Person.getAge() >=18));
    }

}
