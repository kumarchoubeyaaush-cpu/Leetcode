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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len =0;
        ListNode tmp =head;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        int index=len-n;
        if(index==0){
            head=head.next;
            return head;
        }
        tmp=head;
        for(int i=0;i<index-1;i++)tmp=tmp.next;
        tmp.next=tmp.next.next;
        return head;
    }
}