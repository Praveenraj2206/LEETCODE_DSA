/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode sortList(ListNode head) 
    {
        return mergeSort(head);
    }
    public ListNode mergeSort(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next != null)
        {
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(slow);
        ListNode ans = merge(left,right);
        return ans;
    }
    private ListNode merge(ListNode left, ListNode right) 
    {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (left != null && right != null) 
        {
            if (left.val <= right.val) 
            {
                tail.next = left;
                left = left.next;
            } 
            else 
            {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if (left != null)
            tail.next = left;
        else
            tail.next = right;
        return dummy.next;
    }
}