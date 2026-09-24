class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i < nums1.length; i++){
                nums1[i] = nums2[j];
                j++;
        }

        int temp;
        for(int l = 0; l < nums1.length; l++){
            for(int k = l + 1; k < nums1.length; k++){
                if(nums1[k] < nums1[l]){
                    temp = nums1[l];
                    nums1[l] = nums1[k];
                    nums1[k] = temp;
                }
            }
        }
    }
}