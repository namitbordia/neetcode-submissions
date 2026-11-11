/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node temp = head;
        HashMap<Node , Node> map = new HashMap<>();
        Node nhead = new Node(head.val);
        Node temp2 = nhead;
        temp = temp.next;
        while(temp !=null){
            Node next = new Node(temp.val);
            temp2.next= next;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp2 = nhead;
        temp = head;
         while(temp2 != null){
            map.put(temp, temp2);
            temp = temp.next;
            temp2 = temp2.next;
         }
        temp = head;
        temp2 = nhead;
        while(temp2 != null){
            temp2.random = map.get(temp.random);
            temp = temp.next;
            temp2 = temp2.next;
        }

        return nhead;
    }
}