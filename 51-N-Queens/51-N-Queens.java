// Last updated: 22/9/2025, 9:23:10 pm
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: find the length
        ListNode tail = head;
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // Step 2: effective rotations
        k = k % n;
        if (k == 0) return head;

        // Step 3: find new tail at (n - k - 1)
        ListNode newTail = head;
        for (int i = 0; i < n - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 4: make new head and break the list
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;  // connect old tail to old head

        return newHead;
    }
}