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

    @Test
    public void reverseString(){

        String input = "I love java";

        //expected java love I

        String[] words = input.split(" ");

        String rev = " ";

        for (int i =  words.length -1 ; i >= 0; i--) {
            rev = rev + " " + words[i];
        }

        System.out.println(rev);
    }


}
