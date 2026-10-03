class NumArray {
    private int numsLocal[];
    public NumArray(int[] nums) {
         this.numsLocal = nums;
         for(int i = 1; i < numsLocal.length; i++){
            numsLocal[i] = numsLocal[i] + numsLocal[i - 1];
         }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return numsLocal[right];
        }
        return numsLocal[right] - numsLocal[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */