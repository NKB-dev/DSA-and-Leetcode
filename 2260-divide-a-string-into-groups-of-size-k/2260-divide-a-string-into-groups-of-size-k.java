class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int totalGroups = (n + k - 1) / k;  // ceiling of n / k
        String[] result = new String[totalGroups];
        int index = 0;

        for (int i = 0; i < n; i += k) {
            StringBuilder group = new StringBuilder();

            // Add k characters to the group or fill if out of bounds
            for (int j = 0; j < k; j++) {
                if (i + j < n) {
                    group.append(s.charAt(i + j));
                } else {
                    group.append(fill);  // pad with fill character
                }
            }

            result[index++] = group.toString();
        }

        return result;
    }
}
