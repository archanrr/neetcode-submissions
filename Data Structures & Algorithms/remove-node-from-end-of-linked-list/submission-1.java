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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0, head);
        ListNode currNode = dummy;
        ListNode nextNode = dummy;
        ListNode prev = dummy;
        for(int i=0;i<n;i++) currNode = currNode.next;

        while(currNode.next != null) {
            currNode = currNode.next;
            nextNode = nextNode.next;
        }

        nextNode.next = nextNode.next.next;
        return dummy.next;
    }
}
