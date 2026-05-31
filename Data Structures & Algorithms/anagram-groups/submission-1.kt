class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        strs.forEach { 
            val sorted = it.toCharArray().sorted().toString()
            map.getOrPut(sorted){mutableListOf()}.add(it);
        }

        return map.values.toList();
    }
}
