// Last updated: 11/3/2026, 7:35:57 pm
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
16
17        ListNode fast = dummy;
18        ListNode slow = dummy;
19
20        for(int i = 0; i <= n; i++){
21            fast = fast.next;
22        }
23
24        while(fast != null){
25            fast = fast.next;
26            slow = slow.next;
27        }
28
29        slow.next = slow.next.next;
30
31        return dummy.next;
32    }
33}