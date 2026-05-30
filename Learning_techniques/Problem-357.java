class Problem
{
    public int countNumbersWithUniqueDigits(int n) 
    {
        int sum=0,pre=0,total=0;
        int com=9;
        for(int i=1;i<n;i++)
        {
            if(i==0)
            {
                sum=9;
            }
            else
            {
                pre=sum;
                sum*=com;
                com--;
            }
            total+=pre;
        }
        return sum+total+1;
    }    
}
