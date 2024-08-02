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
    static ListNode curr;
    public static boolean isPalindrome(ListNode head) {
        curr=head;
        return isPalindromeRecursive(head);
    }
    
    public static boolean isPalindromeRecursive(ListNode head) {
        if(head==null) return true;
        boolean ans=isPalindromeRecursive(head.next) && head.val== curr.val;
        curr = curr.next;
        return ans;
    }

    public static ListNode reverse(ListNode curr){
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

    public static ListNode copyList(ListNode head){
        ListNode newNode=new ListNode();
        ListNode copyHead=newNode;

        while (head!=null){
            newNode.val=head.val;
            newNode.next=new ListNode();
            newNode=newNode.next;
            head=head.next;
        }
        return copyHead;
    }
}