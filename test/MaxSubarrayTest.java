import org.junit.Test;

public class MaxSubarrayTest {

    private static void assertEquals(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                assert a[i] == b[i];
            }
        } else assert false;
    }

    @Test
    public void maxSubarray() {
        int[] a1 = {1, 2, 3};
        int[] b1 = {1, 2, 3, -1};
        int[] a2 = {4, -1, -2, 1, 5};
        int[] b2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] a3 = {};
        int[] b3 = {-1, -1};

        assertEquals(a1, MaxSubarray.maxSubarray(b1));
        assertEquals(a2, MaxSubarray.maxSubarray(b2));
        assertEquals(a3, MaxSubarray.maxSubarray(b3));
    }
}
