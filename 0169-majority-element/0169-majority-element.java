class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int temp;
        Arrays.sort(nums);
        return nums[n / 2];
    }
}