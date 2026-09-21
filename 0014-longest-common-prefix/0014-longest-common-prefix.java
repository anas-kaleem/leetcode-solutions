class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        String helper = "";
        for(int i = 0; i < strs.length; i++){
            int j = 0;
            int k = 0;
            helper = "";
             while(j < result.length() && k < strs[i].length()){
                if(result.charAt(j) == strs[i].charAt(k)){
                    helper = helper + strs[i].charAt(k);
                    j++; k++;
                }
                else{
                    result = helper;
                    break;
                }
                
           }
           result = helper;
        }

        return result;
    }
}