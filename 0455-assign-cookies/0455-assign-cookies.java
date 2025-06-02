class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int co =0;
        while(co<s.length && c<g.length){
            if(s[co]>=g[c]){
                c++;
            }
            co++;
        }
        return c;
    }
}