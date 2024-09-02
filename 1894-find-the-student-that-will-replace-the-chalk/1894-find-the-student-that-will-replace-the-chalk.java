class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int length = chalk.length;
        long[] prefix_sum = new long[length + 1];

        // Filling the prefix_sum array, starting from index 1
        for (int i = 0; i < length; i++) {
            prefix_sum[i + 1] = prefix_sum[i] + chalk[i];
        }

        // Reduce k by taking modulo with the total chalk usage (last element in prefix_sum)
        k = (int) (k % prefix_sum[length]);

        // Binary search to find the student who will use the last piece of chalk
        int left = 0, right = length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (prefix_sum[mid] > k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        // The answer is left - 1 because the while loop exits when left == right
        return left - 1;
    }
}
