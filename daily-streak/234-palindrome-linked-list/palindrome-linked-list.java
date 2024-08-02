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
    public static boolean isPalindrome(ListNode head) {
        ListNode newNode=new ListNode();
        ListNode copyHead=newNode;
        ListNode temp=head;

        while (temp!=null){
            newNode.val=temp.val;
            newNode.next=new ListNode();
            newNode=newNode.next;
            temp=temp.next;
        }

        ListNode rev=reverse(head);

        while(copyHead!=null && rev!=null){
            if(copyHead.val != rev.val) return false;

            copyHead=copyHead.next;
            rev=rev.next;
        }

        return true;
    }

    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
}