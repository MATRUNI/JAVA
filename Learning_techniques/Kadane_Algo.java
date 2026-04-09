import java.util.Arrays;
import java.util.Scanner;
class Kadane_Algo
{
    public static int kadane(int[] arr) // For SubArray Sum only
    {
        int max_sum=arr[0],current_sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            current_sum=Math.max(arr[i], current_sum+arr[i]);
            max_sum=Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
    public static int[] kadane_SubArray(int[] arr) // SubArray
    {
        int max_sum=arr[0],current_sum=arr[0];
        int start=0,end=0,temp=0;
        for(int i=1;i<arr.length;i++)
        {
            if(current_sum<0)
            {
                current_sum=arr[i];
                temp=i;
            }
            else 
            {
                current_sum+=arr[i];
            }
            if(current_sum>max_sum)
            {
                max_sum=current_sum;
                start=temp;
                end=i;
            }
        }
        System.out.print(start+" : "+end);
        return Arrays.copyOfRange(arr, start, end+1);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter the Limit of the arrar: ");    
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements of Array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Element "+i+" : ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The Maximum SubArray Sun is: "+kadane(arr));
        System.out.println("The Maximum SubArray is: "+Arrays.toString(kadane_SubArray(arr)));
    }
}
