package arrays;

import org.testng.annotations.Test;

public class ArrayDuplicateRemovalTest {


    @Test
    public void removeDuplicatesFromSortedArray() {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4}; // Sorted input

        if (nums.length == 0) return;

        // 'p' is the slow pointer
        int p = 0;

        // 'i' is the fast pointer
        for (int i = 1; i < nums.length; i++) {
            // If we find a new unique element
            if (nums[i] != nums[p]) {
                p++;           // Move unique pointer forward
                nums[p] = nums[i]; // Update the next unique spot
            }
        }

        // Results: The unique elements are in the first (p + 1) positions
        System.out.println("Number of unique elements: " + (p + 1));
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k <= p; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
