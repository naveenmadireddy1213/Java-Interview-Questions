package twopointertechniques;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoPointerSolutions {



    @Test
    public void palindromeUsingTwoPointer() {
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


    @Test
    public void reverseWithKeepingSpaces() {
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



    @Test //Need to revisit
    public void removeDuplicatesFromSortedArray() {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4}; // Sorted input

        if (nums.length == 0) return;

        // 'i' is the slow pointer
        int p = 0;

        // 'j' is the fast pointer
        for (int i = 1; i < nums.length; i++) {
            // If we find a new unique element
            if (nums[i] != nums[p]) {
                p++;           // Move unique pointer forward
                nums[p] = nums[i]; // Update the next unique spot
            }
        }

        // Results: The unique elements are in the first (i + 1) positions
        System.out.println("Number of unique elements: " + (p + 1));
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k <= p; k++) {
            System.out.print(nums[k] + " ");
        }
    }


}
