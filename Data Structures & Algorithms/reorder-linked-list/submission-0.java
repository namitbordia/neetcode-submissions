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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count %2 == 0){
            count--;
        }
        ListNode p = head;
        int trav = 0;
        while(trav != count/2){
            ListNode n = head;
            while(n.next.next != null){
                n=n.next;
            }
            ListNode c = n.next;
            ListNode h = p.next;
            p.next = n.next;
            n.next = null;
            c.next = h;
            if(p.next != null){
                p=p.next.next;

            }
            trav++;
        }
    }
}