package streams;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamAnalysisTest {

    @Test
    public void shouldFindSecondMostRepeatedCharacterUsingStreams() {
        String name = "aaabbbbbcccc";
        Optional<Map.Entry<Character, Long>> secondMostRepeatedCharacter = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .skip(1)
                .findFirst();
        Assert.assertEquals(secondMostRepeatedCharacter, Optional.of(Map.entry('c', 4L)));
    }

    @Test
    public void shouldFindLongestWordInSentence() {

        String input = "I am learning Streams API in Java";
        String expectedOutput = "learning";

        Assert.assertEquals(Stream.of(input.split("\\s+"))
                .max(Comparator.comparing(String::length))
                .get(), expectedOutput);
//with out max method
        Assert.assertEquals(Stream.of(input.split("\\s+"))
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst()
                .orElse(" "), expectedOutput);
    }

    @Test
    public void shouldRemoveDuplicateCharsAndMaintainOrder() {
        String input = "dabcadefg";
        String expectedOutput = "dabcefg";

        Assert.assertEquals(Arrays.stream(input.split(""))
                .distinct()
                .collect(Collectors.joining()), expectedOutput);
    }

    @Test
    public void shouldFindSecondLongestWordInSentence() {
        String input = "I am learning Streams API in Java";
        String expectedOutput = "Streams";
        Assert.assertEquals(Arrays.stream(input.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse(" "), expectedOutput);
    }

    @Test
    public void shouldCalculateSecondHighestWordLength() {
        String input = "I am learning Streams API in Java";
        int expectedOutput = 7;

        Assert.assertEquals(Arrays.stream(input.split(" "))
                        .map(String::length)
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(0)
                , expectedOutput);
    }

    @Test
    public void shouldRankWordsByFrequencyOfOccurrence() {

        String input = "I am learning Streams API in Java Java";
        //  String expectedOutput = "{java=2, in=1, I=1, API=1, leaning=1, am=1, Streams=1";

        System.out.println(Arrays.stream(input.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting())));
    }

}
