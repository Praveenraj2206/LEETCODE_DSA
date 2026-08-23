/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        if(head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }



    // public boolean hasCycle(ListNode head) 
    // {
    //     if(head == null)
    //         return false;
    //     HashSet<ListNode> set = new HashSet<>();
    //     ListNode node = head;
    //     while(!set.contains(node))
    //     {
    //         set.add(node);
    //         node = node.next;
    //         if(node == null)
    //             return false;
    //     }
    //     return true;
    // }
}