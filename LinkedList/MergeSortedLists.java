// Merge Two Sorted Lists

// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

// Example:

// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        while (l1!=null&&l2!=null){
            if (l1.val>l2.val){
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }else{
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }
        }
        
        if (l1!=null){
            cur.next = l1;
        }
        if (l2!=null){
            cur.next = l2;
        }
        
        return dummy.next;
    }
}