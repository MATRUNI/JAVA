// Problem 4

public class MedianOfSortArray 
{
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1}, new int[]{2,3,4,5,6}));
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3}));
        System.out.println(findMedianSortedArrays(new int[]{1,3,5,7}, new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int c=0,left=0,right=0;
        int cu=0,pre=0;
        while (c<=n/2) 
        {
            pre=cu;
            if(left<n1 && (right>=n2 || nums1[left]<=nums2[right]))
            {
                cu=nums1[left];
                left++;
            }
            else
            {
                cu=nums2[right];
                right++;
            }
            c++;
        }
        if(n%2==1)
        {
            return cu;
        }
        else
        {
            return (cu+pre)/2.0;
        }
    }    
    
}
