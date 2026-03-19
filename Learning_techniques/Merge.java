// Problem 56
import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        int[][] arr={{1,3}, {2,6} ,{8,10} ,{8,9}, {9,11},{15,18}, {2,4} ,{16,17}};
        arr=merge(arr);
        for(int[] x:arr)
        {
            for(int a:x)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    static int[][] merge(int[][] intervals)
    {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[][] result=new int[intervals.length][2];
        int top=-1;
        for(int i=0;i<intervals.length;i++)
        {
            if(top==-1 || result[top][1]<intervals[i][0])
            {
                top+=1;
                result[top]=intervals[i];
            }
            else
            {
                result[top][0]=Math.min(intervals[i][0], result[top][0]);
                result[top][1]=Math.max(intervals[i][1], result[top][1]);
            }
        }
        return Arrays.copyOf(result, top+1);
    }   
}