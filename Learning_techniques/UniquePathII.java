public class UniquePathII {
    int f(int r,int c,int[][] w,int[][] dp)
    {
        if(r>=w.length || c>=w[0].length || w[r][c]==1) return 0;
        if(r==w.length-1 && c==w[0].length-1) return 1;
        if(dp[r][c]!=0)
        {
            return dp[r][c];
        }
        dp[r][c]=-1;

        if(r==w.length-1) return f(r, c+1, w, dp);
        if(c==w[0].length-1) return f(r+1, c, w, dp);
        return dp[r][c]=f(r+1, c, w, dp)+f(r, c+1, w, dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        return f(0, 0, obstacleGrid, dp);
    }
    public static void main(String[] args) {
        int[][] a={{0,0,0},{0,1,0},{0,0,0}};
        UniquePathII u=new UniquePathII();
        System.out.println(u.uniquePathsWithObstacles(a));
    }
}
