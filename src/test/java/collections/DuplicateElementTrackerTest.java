package collections;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElementTrackerTest {

    @Test
    public void shouldReturnDuplicatesInFirstOccurrenceOrder(){
        int[] numbers = {4, 3, 2, 7, 8 , 2, 3, 1};

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = new LinkedHashSet<>();

        for(int number : numbers){

            if(!seen.add(number)){

                duplicates.add(number);
            }
        }
        System.out.println(duplicates);
    }
}
