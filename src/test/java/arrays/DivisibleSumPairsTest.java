package arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisibleSumPairsTest {


    @Test
    public void shouldCountPairsWithSumDivisibleByKOptimized() {

        int[] arr = {5, 9, 36, 74, 52, 31, 42};
        int k = 3;
        int count = 0;
        int[] reminderFrequency = new int[k];

        for (int num : arr) {
            int rem = num % k;
            int target = (k - rem) % k;
            count += reminderFrequency[target];
            reminderFrequency[rem]++;
        }

        Assert.assertEquals(count, 7);
    }
}
