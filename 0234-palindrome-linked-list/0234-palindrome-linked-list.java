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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
        
//     }
// }


// TC:O(N) + O(N) =O(N)

class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {
        ListNode newHead = null;
        ListNode curr = head;
        int count = 0;

        while(curr != null)
        {
            ListNode node = new ListNode(curr.val);
            node.next = newHead;
            curr = curr.next;
            newHead = node;
            count++;
        }

        ListNode temp1 = newHead;
        ListNode temp2 = head;

        for(int i = 0; i < count / 2; i++)
        {
            if(temp1.val != temp2.val)
                return false;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }
}