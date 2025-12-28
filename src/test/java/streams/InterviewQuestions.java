package streams;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InterviewQuestions {

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

        System.out.println(secondMostRepeatedCharacter);



    }

    @Test
    public void findDuplicatesInAList(){

        List<String> courses = new ArrayList<>(List.of("java", "selenium", "java", "rest assured"));
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));


    }
}
