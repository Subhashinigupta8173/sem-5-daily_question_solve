// Last updated: 20/7/2026, 12:52:07 am
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> pq=new PriorityQueue<>(new  Comparator<>() {
14            public int compare(ListNode o1,ListNode o2){
15                return o1.val-o2.val;
16            }
17        });
18        ListNode dummy=new ListNode();
19        ListNode  temp=dummy;
20        for(int i=0; i<lists.length;i++){
21            if(lists[i]!=null){
22                pq.add(lists[i]);
23            }
24        }
25        while(!pq.isEmpty()){
26            ListNode r=pq.poll();
27            dummy.next=r;
28            dummy=dummy.next;
29            if(r.next!=null){
30                pq.add(r.next);
31            }
32        }
33        return temp.next;
34        
35        
36    }
37}