// Last updated: 5/8/2025, 10:24:55 pm
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        node.val=node.next.val;
        node.next=node.next.next;
    }
}