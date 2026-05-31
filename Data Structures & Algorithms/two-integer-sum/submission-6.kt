class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for((idx, values) in nums.withIndex()) {
            val complement = target - values;
            if(map.containsKey(complement)) {
                return intArrayOf(map.getOrDefault(complement, -1),idx);
            } else {
                map.put(values, idx);
            }
        }
        return intArrayOf()
    }
}
