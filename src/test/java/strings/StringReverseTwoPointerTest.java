package strings;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StringReverseTwoPointerTest {

    @Test
    public void stringReverse() {
        String input = "Automation";

        //Simple String Builder Approach
        System.out.println(new StringBuilder(input).reverse());

        //Two pointer
        int left = 0;
        int right = input.length() - 1;

        char[] characterArray = input.toCharArray();

        while (left <= right) {
            char temp = characterArray[left];
            characterArray[left] = characterArray[right];
            characterArray[right] = temp;
            left++;
            right--;
        }

        System.out.println(characterArray);

    }

    @Test
    public void findADuplicateInAList() {

        List<String> elements = Arrays.asList("Home", "Login", "Home", "Cart", "Login");
        //Hash Set Approach
        Set<String> distinctList = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String ele : elements) {
            if (!distinctList.add(ele)) {
                duplicates.add(ele);
            }
        }
        System.out.println(duplicates);

        //Java 8

        System.out.println(elements.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(element -> element.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList());
    }




}
