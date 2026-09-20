class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indices[] = new int[2];
        boolean isTrue = false;
        int sum;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    isTrue = true;
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        if(isTrue == true){
            return indices;
        }
        else{
            return indices;
        }
    }
}