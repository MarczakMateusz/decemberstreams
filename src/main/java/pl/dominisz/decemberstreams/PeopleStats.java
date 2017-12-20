package pl.dominisz.decemberstreams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStats {

    public static Stats getStats7(List<Person> people) {
        int countValue = 0;
        int sumValue = 0;
        int minValue = 150;
        int maxValue = 0;

        for(;countValue<people.size();countValue++){


            int age = people.get(countValue).getAge();
            sumValue = sumValue + age;

            if(minValue > age) minValue = age;
            if(maxValue < age) maxValue = age;

        }
        return new Stats(countValue, sumValue, minValue, maxValue);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {
        return people.stream().collect(Collectors.summarizingInt(Person::getAge));
    }

}
