// Last updated: 22/7/2026, 12:13:12 am
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
12    public boolean isPalindrome(ListNode head) {
13    if(head == null || head.next == null){
14        return true;
15    }
16    ListNode slow = head;
17    ListNode fast = head;
18    while(fast != null && fast.next != null) {//find mid of te linklist
19        slow = slow.next;
20        fast = fast.next.next;
21    }
22    ListNode prev = null;
23    ListNode curr = slow;//mid of te node
24    while(curr != null){//reverse  all nides after te mid of node
25        ListNode next = curr.next;
26        curr.next = prev;
27        prev = curr;
28        curr = next;
29
30    }
31    //compare te bot nodes
32    ListNode first = head;
33    ListNode second = prev;
34    while(second != null){
35        if(first.val != second.val){
36            return false;
37
38        }
39        first = first.next;
40        second = second.next;
41    }
42    return true;
43
44
45
46
47
48
49
50
51        
52    }
53}