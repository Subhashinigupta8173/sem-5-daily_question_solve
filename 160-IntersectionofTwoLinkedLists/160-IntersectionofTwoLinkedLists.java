// Last updated: 21/7/2026, 7:39:50 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode p1 = headA; 
15        ListNode p2 = headB;
16        while(p1 != p2){
17            if(p1 == null){
18                p1 = headB;
19            }
20            else{
21                p1 = p1.next;
22            }
23            if(p2 == null){
24                p2 = headA;
25            }
26            else{
27                p2 = p2.next;
28            }
29        }
30        return p1;
31    }
32}