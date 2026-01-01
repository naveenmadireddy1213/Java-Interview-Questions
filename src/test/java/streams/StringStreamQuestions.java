package streams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamQuestions {

    @Test
    public void findSecondMostRepeatedCharacterFromAString() {

        String name = "aaabbbbbcccc";

        Optional<Map.Entry<Character, Long>> secondMostRepeatedCharacter = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .skip(1)
                .findFirst();
        Assert.assertEquals(Optional.of(Map.entry('c', 4L)), secondMostRepeatedCharacter);
    }

    @Test
    public void findDuplicatesInAList() {

        List<String> courses = new ArrayList<>(List.of("java", "selenium", "java", "rest assured"));
        Assert.assertEquals(Map.of("java", 2L), courses.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    @Test
    public void givenASentenceFindTheWordThatHasTheHighestLength(){

        String input = "I am learning Streams API in Java";
        String expectedOutput = "learning";

       Assert.assertEquals(expectedOutput,  Stream.of(input.split("\\s+"))
                .max(Comparator.comparing(String::length))
                .get());

    }



}
