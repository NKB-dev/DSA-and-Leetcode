class Solution {
    public String reverseWords(String s) {
        String N = "";
        String[] w = s.trim().split("\\s+");  // trim and split on one or more spaces

        for (int i = w.length - 1; i >= 0; i--) {
            N = N + w[i];
            if (i != 0) {
                N = N + " ";
            }
        }
        return N;
    }
}
