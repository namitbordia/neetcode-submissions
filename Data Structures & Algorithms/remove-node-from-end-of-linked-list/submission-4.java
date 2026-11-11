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
        int k=0;
        ListNode t = head;
        int c=0;
        while(t != null){
            c++;
            t = t.next;
        }
        if(n==1){
            ListNode temp = head;
            if(c == 1){
                head= head.next;
                return head;
            }
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
        else if(c == n){
            head = head.next;
        }
        else{
            k=c;
            ListNode temp = head;
            for(int i =1;i<c-n;i++){
                temp = temp.next;

            }
            temp.next=temp.next.next;
            
        }
        return head;

    }
}
