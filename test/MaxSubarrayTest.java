import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxSubarrayTest {

    @Test
    public void maxSubarray() {
        int[] a1 = {1, 2, 3};
        int[] b1 = {1, 2, 3, -1};
        int[] a2 = {4, -1, -2, 1, 5};
        int[] b2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] a3 = {};
        int[] b3 = {-1, -1};

        assertArrayEquals(a1, MaxSubarray.maxSubarray(b1));
        assertArrayEquals(a2, MaxSubarray.maxSubarray(b2));
        assertArrayEquals(a3, MaxSubarray.maxSubarray(b3));
    }
}
