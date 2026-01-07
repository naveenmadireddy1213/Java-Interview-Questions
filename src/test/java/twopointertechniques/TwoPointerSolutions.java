package twopointertechniques;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoPointerSolutions {

    @Test
    public void reverseArrayUsingTwoPointerTechnique() {
        int[] array = {1, 2, 3, 4, 5};
        int left = 0;
        int right = array.length - 1;

        if (array.length <= 1 || array == null) {
            System.out.println(Arrays.toString(array));
            return;
        }

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(array));
    }

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

    @Test
    public void moveOnesToTheEndOfTheArray() {

        int[] input = {0, 1, 0, 3, 12, 1};

        int pointer = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] != 1) {
                input[pointer] = input[i];
                pointer++;
            }
        }

        while (pointer < input.length) {
            input[pointer] = 1;
            pointer++;
        }
        System.out.println(Arrays.toString(input));
    }

    @Test
    public void moveZerosToTheFrontOfTheArray() {
        int[] nums = {5, 0, 1, 0, 3, 12};
        int pointer = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer--;
            }
        }

        while (pointer >= 0) {
            nums[pointer] = 0;
            pointer--;
        }
        System.out.println(Arrays.toString(nums));
    }


}
