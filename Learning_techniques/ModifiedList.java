// Problem 3217
import java.util.HashMap;
import java.util.Map;
public class ModifiedList {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Map<Integer,Boolean> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num, true);
        }
        ListNode curr=new ListNode(0);
        curr.next=head;
        head=curr;

        while(curr!=null && curr.next!=null)
        {
            if(map.containsKey(curr.next.val))
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        return head.next;
    }
}
