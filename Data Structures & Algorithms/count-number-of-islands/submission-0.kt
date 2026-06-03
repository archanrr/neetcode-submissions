class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        for(i in 0 until grid.size) {
            for(j in 0 until grid[0].size) {
                if(grid[i][j] == '1') {
                    dfs(grid,i,j)
                    count++;
                }
            }
        }
        return count
    }

    fun dfs(grid: Array<CharArray>, row: Int, col: Int) {
        if(row < 0 || row >= grid.size || col < 0 || col >= grid[0].size || grid[row][col] == '0') {
            return
        }
        
        grid[row][col] = '0'

        dfs(grid,row+1,col);
        dfs(grid,row,col+1)
        dfs(grid,row-1,col)
        dfs(grid,row,col-1)
    }
}
