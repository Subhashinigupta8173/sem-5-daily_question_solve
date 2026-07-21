// Last updated: 21/7/2026, 10:43:57 am
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head == null || head.next == null){
14            return head;
15        }
16        ListNode odd = head;
17        ListNode even = head.next;
18        ListNode evenHead = even;
19        if(head == null){
20            return null;
21        }
22        
23        while(even != null && even.next != null ){
24            odd.next = even.next;
25            odd = odd.next;
26            even.next = odd.next;
27            even = even.next;
28        }
29        odd.next = evenHead;
30        return head;
31        
32        
33    }
34}