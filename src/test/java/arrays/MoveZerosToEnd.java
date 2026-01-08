package arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MoveZerosToEnd {

    @Test
    public void shouldMoveAllTargetedNumberToTheEndOfArray() {

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
