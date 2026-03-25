// Problem 3546

import java.util.Arrays;

public class CanPartionGrid {
    public static void main(String[] args) {
        int [] [] ar={{1,4},
                      {2,3}};
        System.out.println(canPartitionGrid(ar));
    }
    public static boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long sum=0;
        long[] rowSum=new long[m];
        long[] colSum=new long[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                rowSum[i]+=grid[i][j];
                sum+=grid[i][j];
                colSum[j]+=grid[i][j];
            }
        }
        System.out.println(Arrays.toString(rowSum));
        System.out.println(Arrays.toString(colSum));
        System.out.println(sum);
        long counterSum=0;
        for(int i=0;i<m;i++)
        {
            counterSum+=rowSum[i];
            long subSum=sum-counterSum;
            if(counterSum==subSum)
            {
                return true;
            }
        }
        counterSum=0;
        for(int i=0;i<n;i++)
        {
            counterSum+=colSum[i];
            long subSum=sum-counterSum;
            if(counterSum==subSum)
            {
                return true;
            }
        }
     return false;   
    }
}
