package easyquestions;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EasyQuestions {


    @Test
    public void mergeAndSortArrays() {

        int[] a = {5, 1, 3, 7};
        int[] b = {6, 4, 2, 8};

        Stream.of(a, b)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .forEach(System.out::println);
    }


}
