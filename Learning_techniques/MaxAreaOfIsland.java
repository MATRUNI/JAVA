// Problem 695


public class MaxAreaOfIsland {
    int f(int r,int c,int[][] w)
    {
        if(r<0 || c<0 || r>=w.length || c>=w[0].length || w[r][c]==0) return 0;
        w[r][c]=0;
        return 1 + f(r+1, c, w) + f(r-1, c, w) + f(r, c+1, w) + f(r, c-1, w);
    }
    public int maxAreaOfIsland(int[][] grid) 
    {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    max=Math.max(max, f(i, j, grid));
                }
            }
        }
        return max;
    }
}
