// Problem 2946
import java.util.Arrays;

public class MatrixSimilarity 
{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{1,2,1,2},{5,5,5,5},{6,3,6,3}};
        System.out.println(areSimilar(arr2,2));
    }
    public static boolean areSimilar1(int[][] mat, int k) 
    {
        int m=mat.length;
        int n=mat[0].length;
        if(k%n==0) return true;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]!=mat[i][(j+k)%n])
                    return false;
            }
        }
        return true;
    }
    public static boolean areSimilar(int[][] mat, int k) 
    {
        int m=mat.length;
        int n=mat[0].length;
        int[] stack=new int[n];
        int[][] newMat=new int[m][n];
        k=k%n;
        for(int i=0;i<m;i++)
        {
            int shift=k;
            if(i%2!=0)
            {
                for(int j=0;j<n;j++)
                {
                    stack[shift]=mat[i][j];
                    shift++;
                    shift=shift%n;
                }
                for(int j=0;j<n;j++)
                {
                    newMat[i][j]=stack[j];
                }
            }
            else
            {
                for(int j=0;j<n;j++)
                {
                    stack[j]=mat[i][shift];
                    shift++;
                    shift=shift%n;
                }
                for(int j=0;j<n;j++)
                {
                    newMat[i][j]=stack[j];
                }
            }
        }
        return Arrays.deepEquals(mat, newMat);
    }    
}
