// Last updated: 19/1/2026, 9:54:31 pm
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummyHead=new ListNode(0);
14        ListNode current = dummyHead;
15        int carry =0;
16  
17    
18    while(l1!=null || l2!= null){
19        int x=(l1!=null)? l1.val:0;
20        int y=(l2!=null )?l2.val:0;
21        int sum= carry+x+y;
22        carry =sum/10;
23        current.next=new ListNode(sum%10);
24        current=current.next;
25        if(l1!=null) l1=l1.next;
26        if(l2!=null)l2=l2.next;
27    }
28    if(carry>0){
29        current.next=new ListNode(carry);
30
31    }
32    return dummyHead.next;
33    }
34}