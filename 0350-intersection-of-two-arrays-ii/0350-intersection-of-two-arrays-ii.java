class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> n = new ArrayList<>();
        
        if (nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        n.add(nums1[i]);
                        nums2[j] = Integer.MIN_VALUE; // Optional: mark as used
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                for (int j = 0; j < nums1.length; j++) {
                    if (nums2[i] == nums1[j]) {
                        n.add(nums2[i]);
                        nums1[j] = Integer.MIN_VALUE; // Optional: mark as used
                        break;
                    }
                }
            }
        }

        int[] arn = n.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();

        return arn;
    }
}
