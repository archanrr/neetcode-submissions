class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            if(hmap.containsKey(nums[i])) {
                result[0]= hmap.get(nums[i]);
                result[1] = i;
                return result;
            }
            hmap.put(target - nums[i], i);
        }
        return result;
    }
}
