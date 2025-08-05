// Last updated: 5/8/2025, 10:25:54 pm
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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode Dumy=new ListNode();
        ListNode temp=Dumy;
        while(A!=null && B!=null){
            if(A.val<B.val){
                Dumy.next=A;
                Dumy=Dumy.next;
                A=A.next;

            }
            else{
                Dumy.next=B;
                Dumy=Dumy.next;
                B=B.next;


            }
        }
        if(A==null){
            Dumy.next=B;
        }
        if(B==null){
            Dumy.next=A;
        }
        return temp.next;
        
    }
}