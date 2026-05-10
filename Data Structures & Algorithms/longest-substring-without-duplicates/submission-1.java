class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();

        int maxLen = 0;
        int i = 0;
        for(int r=0;r<s.length();r++) {
            if(!hset.contains(s.charAt(r))) {
                hset.add(s.charAt(r));
                maxLen = Math.max(maxLen, hset.size());
            } else {
                while(hset.contains(s.charAt(r))) {
                    hset.remove(s.charAt(i));
                    i++;
                }
                hset.add(s.charAt(r));
            }
        }
        return maxLen;
    }
}
