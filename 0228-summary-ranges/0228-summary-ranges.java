class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int pointer = 0;
        for(int i = 0; i < nums.length; i++){
            pointer = i;
            while(pointer + 1 < nums.length && nums[pointer + 1] - nums[pointer] == 1){
                pointer = pointer + 1;
            }
            if(nums[i] == nums[pointer]){
                list.add(nums[pointer] + "");

            }
            else{
                list.add(nums[i] + "->" + nums[pointer]);
                i = pointer;
            }
        }
        return list;
    }
}