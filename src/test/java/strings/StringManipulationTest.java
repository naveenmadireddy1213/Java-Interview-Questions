package strings;

import org.testng.annotations.Test;

public class StringManipulationTest {

    @Test
    public void shouldReverseWordsInSentence() {

        String input = "I love java";

        //expected java love I

        String[] words = input.split(" ");

        String rev = " ";

        for (int i = words.length - 1; i >= 0; i--) {
            rev = rev + " " + words[i];
        }

        System.out.println(rev);

    }
}
