class Solution {
    public int[] plusOne(int[] digits) {
        int helper[];
        int size = digits.length;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            else if(digits[i] == 9 && i == 0){
                digits[i] = 0;
                size++;
                helper = new int[size];
                helper[0] = 1;
                for(int l = 0; l < digits.length; l++){
                    helper[l + 1] = digits[l];
                }
                return helper;
            }
            else if(digits[i] == 9 && i > 0){
                digits[i] = 0;
            }
        }
        return digits;
    }
}