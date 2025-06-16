class Solution {
    public int maximumDifference(int[] nums) {
        int minSoFar = nums[0];
        int maxDiff = -1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > minSoFar) {
                int diff = nums[j] - minSoFar;
                maxDiff = Math.max(maxDiff, diff);
            } else {
                minSoFar = nums[j];
            }
        }

        return maxDiff;
    }
}
