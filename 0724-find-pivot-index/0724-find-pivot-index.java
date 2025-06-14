class Solution {
    public int pivotIndex(int[] nums) {
        int   t=0;
        for(int n:nums){
            t = t+n;


        }
        int l =0;

       for (int i = 0; i < nums.length; i++) {
        l += nums[i];                         // accumulate left sum including nums[i]
        int r = t - l;                        // right sum is remaining
        if (l - nums[i] == r) return i;       // exclude nums[i] from left before comparing as its pivot..
    }
    return -1;
}
}