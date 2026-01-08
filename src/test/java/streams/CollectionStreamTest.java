package streams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionStreamTest {


    @Test
    public void shouldFindAllDuplicateElementInList() {

        List<String> courses = new ArrayList<>(List.of("java", "selenium", "java", "rest assured"));
        Assert.assertEquals(courses.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)), Map.of("java", 2L));
    }
}
