class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n < 2) return n; 
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        int max = 0;
        int curr;
        int streak = 0;
        for(int num : set) {
            if(!set.contains(num-1)) {
                streak = 1;
                curr = num;
                while(set.contains(curr+1)) {
                    streak++;
                    curr = curr+1;
                }
            }
            max = Math.max(max, streak);
        }
        return max;
    }
}
