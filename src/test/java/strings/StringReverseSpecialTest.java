package strings;

import org.testng.annotations.Test;

public class StringReverseSpecialTest {


    @Test
    public void shouldReverseStringWhileKeepingSpaces() {
        String originalValue = "I am an excellent qa";

        char[] character = originalValue.toCharArray();

        int left = 0;
        int right = originalValue.length() - 1;

        while (left < right) {
            if (character[left] == ' ') {
                left++;
            } else if (character[right] == ' ') {
                right--;
            } else {
                char tmp = character[left];
                character[left] = character[right];
                character[right] = tmp;
                left++;
                right--;
            }
        }
        System.out.println("original value = " + originalValue);
        System.out.println("reversed value = " + String.valueOf(character));

    }
}
