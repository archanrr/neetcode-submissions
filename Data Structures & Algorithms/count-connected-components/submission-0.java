class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();

        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int count=0;
        for(int i=0;i<n;i++) {
            if(!visited[i]) {
                visited[i] = true;
                bfs(adj,visited,i);
                count++;
            }
        }
        return count;
    }

    public void bfs(List<List<Integer>> adj, boolean[] visited, int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()) {
            int ele = q.poll();
            visited[ele] = true;
            for(int i : adj.get(ele)) {
                if(!visited[i]) {
                    q.add(i);
                } 
            }
        }
    }
}
