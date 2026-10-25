
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int c = 0;

        for (int a = 0; a < k; a++) {
            int min = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[min]) {
                    min = i;
                }
            }
            nums[min] = nums[min] * -1;
        }

        for (int i = 0; i < nums.length; i++) {
            c += nums[i];
        }

        return c;
    }
}
