

class Check_ArrayIs_Sorted 
{
    static boolean isSorted(int[] a,int index)
    {
        if(index==a.length)
        {
            return true;
        }
        if(a[index]<a[index-1])
        {
            return false;
        }

        return isSorted(a, index+1);
    }
    public static void main(String[] args) 
    {
        int[] arr={1,2,6,4,5};
        System.out.println(isSorted(arr,1));
    }
}
