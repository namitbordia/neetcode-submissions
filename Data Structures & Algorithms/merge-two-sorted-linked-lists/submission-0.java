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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = new ListNode(-1);
        ListNode l = curr;
        ListNode temp = list1;
        ListNode temp2 = list2;
        while(temp != null && temp2 != null){
            if(temp.val > temp2.val){
                l.next = temp2;
                temp2=temp2.next;
            }
            else{
                l.next = temp;
                temp=temp.next;
            }
            l=l.next;
        }
        while(temp != null){
            l.next = temp;
            temp = temp.next;
            l=l.next;
        }
        while(temp2 != null){
            l.next = temp2;
            temp2=temp2.next;
            l= l.next;
        }
        return curr.next;
    }
}