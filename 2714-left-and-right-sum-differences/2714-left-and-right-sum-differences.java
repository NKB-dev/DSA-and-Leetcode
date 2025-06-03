class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arrl = new int[nums.length]; // left sum
        int[] arrr = new int[nums.length]; // right sum
        int[] result = new int[nums.length]; // final result

        arrl[0] = 0;
        arrr[nums.length - 1] = 0;

        int suml = 0;
        int sumr = 0;

        // Compute left prefix sums
        for (int i = 1; i < nums.length; i++) {
            suml += nums[i - 1];
            arrl[i] = suml;
        }

        // Compute right suffix sums
        for (int i = nums.length - 2; i >= 0; i--) {
            sumr += nums[i + 1];
            arrr[i] = sumr;
        }

        // Compute absolute difference
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(arrl[i] - arrr[i]);
        }

        return result;
    }
}
