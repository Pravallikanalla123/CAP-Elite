class Solution {
    int[][] dirs = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
    public boolean containsCycle(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!visited[i][j]){
                    if(isCycle(grid, i, j, visited, -1, -1))
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean isCycle(char[][] grid, int i, int j, boolean[][] visited, int prevI, int prevJ)
    {
        visited[i][j] = true;
        
        for(int[] dir: dirs){
            int x = i+dir[0];
            int y = j+dir[1];
            
            if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]!=grid[i][j])
                continue;
            
            if(x == prevI && y == prevJ)
                continue;
            
            if(visited[x][y])
                return true;
            
            if(isCycle(grid, x, y, visited, i, j))
                return true;
        }
        return false;
    }
}
