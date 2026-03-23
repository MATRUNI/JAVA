// Problem 532

import java.util.HashMap;
import java.util.Map;

public class KdiffPairs {
    public static void main(String[] args) {
        int a=findPairs(new int[]{1,3,1,4,5}, 0);
        System.out.println(a);
    }
    public static int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entity: map.entrySet())
        {
            if(k==0)
            {
                if(entity.getKey()>1)
                count++;
            }
            else
            {
                if (map.containsKey(entity.getKey()+k)) 
                {
                    count++;
                }
            }
        }
        System.out.println(map);
        return count;
    }
}
