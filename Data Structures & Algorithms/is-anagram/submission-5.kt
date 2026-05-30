class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val count = IntArray(26)
        for(idx in s.indices) {
            count[s[idx] - 'a']++;
            count[t[idx] - 'a']--;
        }
        return count.all { it == 0 };
    }
}
