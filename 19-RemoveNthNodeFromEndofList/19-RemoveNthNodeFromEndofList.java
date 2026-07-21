// Last updated: 21/7/2026, 6:56:23 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16        ListNode first = dummy;
17        ListNode second = dummy;
18        
19        
20        for (int i = 0; i <= n; i++) {
21            first = first.next;
22        }
23        
24       
25        while (first != null) {
26            first = first.next;
27            second = second.next;
28        }
29        
30        // Remove nth node
31        second.next = second.next.next;
32        
33        return dummy.next;
34    }
35}