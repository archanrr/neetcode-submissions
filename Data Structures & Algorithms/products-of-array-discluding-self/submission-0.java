class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1; 
        int zeroCount = 0;
        int zeroPos = -1;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) product *= nums[i];
            else {
                zeroCount++;
                zeroPos = i;
                if(zeroCount > 1) return result;
            }
        }
        if(zeroCount == 1) {
            result[zeroPos] = product;
            return result;
        } 
        for(int i=0;i<nums.length;i++) {
            result[i] = product/nums[i];
        }
        return result;
    }
}  
