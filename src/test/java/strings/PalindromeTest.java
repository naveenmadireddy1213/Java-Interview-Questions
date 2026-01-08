package strings;

import org.testng.annotations.Test;

public class PalindromeTest {
    @Test
    public void shouldVerifyIfStringPalindrome() {
        String palindrome = "level";
        int left = 0;
        int right = palindrome.length() - 1;

        if (palindrome == null) {
            System.out.println("palidrome shouldn't be null");
            return;
        }

        if (palindrome.length() <= 1) {
            System.out.println("It is a palindrome");
            return;
        }
        while (left < right) {
            if (Character.toLowerCase(palindrome.charAt(left)) != Character.toLowerCase(palindrome.charAt(right))) {
                System.out.println(palindrome + " is not a palindrome");
                return;
            }
            left++;
            right--;

        }
        System.out.println(palindrome + " is a palindrome");
    }
}
