class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(Integer num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1); 
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> freq.get(a) - freq.get(b));

        for(int num : freq.keySet()) {
            q.add(num);
            if(q.size() > k) {
                q.poll();
            }
        }

        int[] result = new int[k];
        int i=0;
        while(q.size() != 0) {
            result[i] = q.poll();
            i++;
        }
        return result;
    }
}
