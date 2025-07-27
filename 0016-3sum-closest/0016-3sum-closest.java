

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int closest = 0;

        // Sort the array to use two-pointer technique
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                // If we find exact target sum, return immediately
                if (sum == target) {
                    return sum;
                }

                // Update closest sum if this one is closer to target
                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    closest = sum;
                }

                // Adjust pointers based on comparison with target
                if (sum < target) {
                    start++; // Need a larger sum
                } else {
                    end--;   // Need a smaller sum
                }
            }
        }
        return closest;
    }
}