import java.util.Arrays;

public class MaxSubarray {
    public static int[] maxSubarray(int[] arr) {
        int result = 0;
        int begin = -1;
        int end = -1;
        int sum = 0;
        int curBegin = -1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > result) {
                result = sum;
                begin = curBegin + 1;
                end = i;
            }

            if (sum <= 0) {
                sum = 0;
                curBegin = i;
            }
        }

        if (arr.length == 0 || end < 0) return new int[]{};

        return Arrays.copyOfRange(arr, begin, end + 1);
    }
}
