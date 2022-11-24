//Iterative Approach

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null)
        {
            //first we will save the next node
            next=curr.next;
            //reverse the node by changing pointer to prev
            curr.next=prev;
            prev=curr;  //making current node previous
            curr=next; // and next node as current
        }
        return prev;
    }
}
