/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int size1 = 0;
        int size2 = 0;
        ListNode A = headA;
        ListNode B = headB;
        while(A != null)
        {
            A = A.next;
            size1++;
        }
        while(B != null)
        {
            B = B.next;
            size2++;
        }
        int diff = Math.abs(size1 - size2);
        if(size1>size2)
        {
            A = headA;
            B = headB;
            while(diff>0)
            {
                A = A.next;
                diff--;
            }
        }
        else
        {
            B = headB;
            A = headA;
            while(diff>0)
            {
                B = B.next;
                diff--;
            }
        }
        while(A != null)
        {
            if(A == B)
                return A;
            A = A.next;
            B = B.next;
        }
        return null;
    }
}