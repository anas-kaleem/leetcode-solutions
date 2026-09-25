class Solution {
    public int singleNumber(int[] nums) {
        int count;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = 0; j < nums.length; j++){
                if(count == 2){
                    break;
                }
                else if(nums[i] == nums[j]){
                    count = count + 1;
                }
            }
            if(count == 1){
                result = nums[i];
                break; 
            }
        }
        return result;
    }
}