class Solution {
    public int missingNumber(int[] nums) {
        int vect[] = new int[nums.length + 1];
        Arrays.fill(vect, -1);
        for(int i = 0; i < nums.length; i++){
            vect[nums[i]] = nums[i];
        }
        for(int i = 0; i < vect.length; i++){
            if(vect[i] == -1){
                return i;
            }
        }
        return 0;
    }
}