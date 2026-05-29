class Problem 
{
    public long matrixSumQueries(int n, int[][] queries) 
    {
        boolean[] visitedCol=new boolean[n];
        boolean[] visitedRow=new boolean[n];
        int filledCols=0;
        int filledRows=0;
        long sum=0;
        for(int i=queries.length-1;i>=0;i--)
        {
            int t=queries[i][0];
            int index=queries[i][1];
            int v=queries[i][2];
            if(t==0)
            {
                if(!visitedRow[index])
                {
                    sum+=(long) (n-filledCols)*v;
                    filledRows++;
                    visitedRow[index]=true;
                }
            }
            else
            {
                if(!visitedCol[index])
                {
                    sum+=(long) (n-filledRows)*v;
                    filledCols++;
                    visitedCol[index]=true;
                }
  
            }
        }
        return sum;
    }    
}
