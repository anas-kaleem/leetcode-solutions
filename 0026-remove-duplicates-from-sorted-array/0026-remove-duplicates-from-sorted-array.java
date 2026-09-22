class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        
        for(int i = 0; i < size; i++){
           
            for(int j =  i + 1; j < size; j++){
                if(nums[i] == nums[j]){
                    size = size - 1;
        
                    for(int l = j; l < size; l++){
                        nums[l] = nums[l + 1];
                    }
                    j = j - 1;
                }
                
            }
        }
        return size;
    }
}