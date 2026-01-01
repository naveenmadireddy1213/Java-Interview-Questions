package streams;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamQuestions {

    @Test
    public void mergeTwoListsWithUniqueValues() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 6, 7);

        System.out.println(Stream.of(list1, list2)
                .flatMap(Collection::stream) //list -> list.stream()
                .distinct()
                .toList());
    }
}
