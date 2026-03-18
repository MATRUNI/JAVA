// Problem 2487
public class RemoveNodes {
    ListNode reverse(ListNode head)
    {
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    public ListNode removeNodes(ListNode head) {
        int max=head.val;
        ListNode curr=head;

        while (curr!=null && curr.next!=null) {
            if(curr.next.val<max)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
                max=curr.val;
            }
        }
        return head;   
    }
}
