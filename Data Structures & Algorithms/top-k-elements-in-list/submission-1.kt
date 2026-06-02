class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for(num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        val pq = PriorityQueue<Int>(compareBy {map[it]})

        for(num in map.keys) {
            pq.offer(num)
            if(pq.size > k) pq.poll()
        }

        return pq.toIntArray().take(k).toIntArray()
    }
}
