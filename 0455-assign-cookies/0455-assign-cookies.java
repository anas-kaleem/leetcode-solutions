class Solution {
    public int findContentChildren(int[] g, int[] s) {
         int maxNum = 0;
         int kidsIndex = g.length - 1;
         int cookieIndex = s.length - 1;
         Arrays.sort(g);
         Arrays.sort(s);
         while(kidsIndex >= 0 && cookieIndex >= 0) {
            if(g[kidsIndex] <= s[cookieIndex]) {
                maxNum = maxNum + 1;
                cookieIndex--;
                kidsIndex--;
            }
            else{
                kidsIndex--;
            }
         }
         return maxNum;
    }
}