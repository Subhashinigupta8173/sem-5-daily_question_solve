// Last updated: 25/7/2026, 9:48:41 am
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
12    public ListNode mergeTwoLists(ListNode A, ListNode B) {
13        ListNode Dumy=new ListNode();
14        ListNode temp=Dumy;
15        while(A!=null && B!=null){
16            if(A.val<B.val){
17                Dumy.next=A;
18                Dumy=Dumy.next;
19                A=A.next;
20
21            }
22            else{
23                Dumy.next=B;
24                Dumy=Dumy.next;
25                B=B.next;
26
27
28            }
29        }
30        if(A==null){
31            Dumy.next=B;
32        }
33        if(B==null){
34            Dumy.next=A;
35        }
36        return temp.next;
37        
38    }
39}