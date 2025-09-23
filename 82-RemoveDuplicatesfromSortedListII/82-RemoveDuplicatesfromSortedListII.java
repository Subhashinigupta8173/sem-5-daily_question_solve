// Last updated: 23/9/2025, 11:51:05 pm
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; // Node before the current sequence
        ListNode curr = head;

        while (curr != null) {
            // Skip duplicates
            boolean isDuplicate = false;
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                // Remove all duplicates
                prev.next = curr.next;
            } else {
                // Move prev if no duplicate
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}