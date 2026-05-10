class Solution {
    public int characterReplacement(String s, int k) {
        int[] ch = new int[26];
        int maxLen = 0;
        int l = 0;
        int maxFreq = 0;
        for(int r=0; r<s.length();r++) {
            ch[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, ch[s.charAt(r) - 'A']);
            while(r-l+1 - maxFreq > k) {
                ch[s.charAt(l) - 'A']--; 
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
