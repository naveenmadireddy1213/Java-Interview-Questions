package arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayReverseTest {

    @Test
    public void shouldReverseArrayInPlaceUsingTwoPointers() {
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
}
