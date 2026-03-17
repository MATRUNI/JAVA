import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i],i );
        }
        for (int i=0;i<nums.length;i++) {
            int x=target-nums[i];

            if(map.containsKey(x))
            {
                int[] s={i,map.get(x)};
                return s;
            }
        }

        return null;
    }
}