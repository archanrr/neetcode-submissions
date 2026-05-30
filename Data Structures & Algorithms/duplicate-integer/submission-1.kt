class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = LinkedHashSet<Int>()
        for(num in nums) {
            if(seen.contains(num)) return true;
            else seen.add(num);
        }
        return false
    }
}
