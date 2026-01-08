package streams;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamArrayOperationsTest {

    @Test
    public void shouldMergeAndSortMultipleArraysUsingStreams() {

        int[] a = {5, 1, 3, 7};
        int[] b = {6, 4, 2, 8};

        Stream.of(a, b)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .forEach(System.out::println);
    }

}
