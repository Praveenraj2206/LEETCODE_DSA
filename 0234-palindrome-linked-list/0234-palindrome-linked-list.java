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
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next; 
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) 
    {
        if(head == null || head.next == null)
            return true;
        ListNode temp = head;
        ListNode middle = findMiddle(head);
        ListNode tail = reverseList(middle);
        while(tail != null)
        {
            if(tail.val != temp.val)
                return false;
            temp = temp.next;
            tail = tail.next;
        }
        return true;
    }
}


// TC:O(N) + O(N/2) = O(N)
// SC:O(N)

// class Solution 
// {
//     public boolean isPalindrome(ListNode head) 
//     {
//         ListNode newHead = null;
//         ListNode curr = head;
//         int count = 0;
//         while(curr != null)
//         {
//             ListNode node = new ListNode(curr.val);
//             node.next = newHead;
//             curr = curr.next;
//             newHead = node;
//             count++;
//         }

//         ListNode temp1 = newHead;
//         ListNode temp2 = head;
//         for(int i = 0; i < count / 2; i++)
//         {
//             if(temp1.val != temp2.val)
//                 return false;
//             temp1 = temp1.next;
//             temp2 = temp2.next;
//         }
//         return true;
//     }
// }