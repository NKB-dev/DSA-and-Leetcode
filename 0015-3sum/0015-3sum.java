

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        if (arr == null || arr.length < 3) return new ArrayList<>();

        // Sort the array
        Arrays.sort(arr);

        // Use HashSet to avoid duplicate triplets
        Set<List<Integer>> result = new HashSet<>();

        // Fix one number and find the other two using two-pointer approach
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    // Add triplet to result set
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need a larger value
                } else {
                    right--; // Need a smaller value
                }
            }
        }

        return new ArrayList<>(result);
    }
}
