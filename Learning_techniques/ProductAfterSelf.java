// Problem 238
import java.util.Arrays;
import java.util.Scanner;

public class ProductAfterSelf 
{
    public static int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int[] result=new int[n];
        // Calculating Suffix Product
        result[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            result[i]=result[i+1]*nums[i];
        }
        // Make the nums array as Prefix Product
        for(int i=1;i<n;i++)
        {
            nums[i]=nums[i-1]*nums[i];
        }
        int pre=1,next=1;
        for(int i=0;i<n;i++)
        {
            pre=(i-1)<0?1:nums[i-1];
            next=(i+1)>=n?1:result[i+1];
            result[i]=pre*next;
        }
        return result;    
    }
    public static int[] productExceptSelf1(int[] nums) 
    {
        int n=nums.length;
        int[] result=new int[n];
        int left=1;
        for(int i=0;i<n;i++)
        {
            result[i]=left;
            left*=nums[i];
        }
        int right=1;
        for(int i=n-1;i>=0;i--)
        {
            result[i]*=right;
            right*=nums[i];
        }
        return result;    
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Limit of the Array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Element "+i+" : ");
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}