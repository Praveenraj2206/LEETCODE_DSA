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
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp=headA;
        while(!set.contains(temp) && temp != null)
        {
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null)
        {
            if(set.contains(temp))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    // {
    //     ListNode t1 = headA;
    //     ListNode t2 = headB;
    //     while(t1 != t2)
    //     {
    //         t1 = (t1==null) ? headB : t1.next;
    //         t2 = (t2==null) ? headA : t2.next;
    //     }
    // }


    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    // {
    //     int size1 = 0;
    //     int size2 = 0;
    //     ListNode A = headA;
    //     ListNode B = headB;
    //     while(A != null)
    //     {
    //         A = A.next;
    //         size1++;
    //     }
    //     while(B != null)
    //     {
    //         B = B.next;
    //         size2++;
    //     }
    //     int diff = Math.abs(size1 - size2);
    //     if(size1>size2)
    //     {
    //         A = headA;
    //         B = headB;
    //         while(diff>0)
    //         {
    //             A = A.next;
    //             diff--;
    //         }
    //     }
    //     else
    //     {
    //         B = headB;
    //         A = headA;
    //         while(diff>0)
    //         {
    //             B = B.next;
    //             diff--;
    //         }
    //     }
    //     while(A != null)
    //     {
    //         if(A == B)
    //             return A;
    //         A = A.next;
    //         B = B.next;
    //     }
    //     return null;
    // }
}