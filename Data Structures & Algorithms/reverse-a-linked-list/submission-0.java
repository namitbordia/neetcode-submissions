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
    public ListNode reverseList(ListNode head) {
        List<Integer> l = new LinkedList<>();
        ListNode temp = head;
        while(temp!=null){
            l.addFirst(temp.val);
            temp=temp.next;
        }
        temp = head;
        while(temp != null){
           temp.val=l.removeFirst();
           temp = temp.next;
        }
        return head;
    }
}
