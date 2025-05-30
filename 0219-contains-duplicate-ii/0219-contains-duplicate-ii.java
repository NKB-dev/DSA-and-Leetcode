class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create a HashMap to store the value and its last seen index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the value has been seen before
            if (map.containsKey(nums[i])) {
                // Check if the previous index is within the allowed range (<= k)
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the map with the current index
            map.put(nums[i], i);
        }
        
        // No duplicates found within the given range
        return false;
    }
}
