class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int index;
        int size = nums1.length + nums2.length;
        int newArray[] = new int[size];
        System.arraycopy(nums1, 0, newArray, 0, nums1.length);
        System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
        Arrays.sort(newArray);
        index = (size / 2) - 1;
        if(size % 2 == 0){
            return ((newArray[index] + newArray[index + 1]) / 2.0);
        }

        else{
            return newArray[index + 1];
        }
        
    }
}