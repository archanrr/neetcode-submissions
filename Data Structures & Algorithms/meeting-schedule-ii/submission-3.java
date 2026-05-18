/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        if(n <= 1) return n;

        Collections.sort(intervals, (a,b) -> a.start - b.start);

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.offer(intervals.get(0).end);

        for(int i=1;i<n;i++) {
            Interval curr = intervals.get(i);
            if(curr.start >= q.peek()) {
                q.poll();
            }

            q.offer(curr.end);
        }
        return q.size();
    }
}
